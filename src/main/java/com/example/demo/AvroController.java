package com.example.demo;

import com.example.avro.Limit;
import com.example.avro.User;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.file.SeekableByteArrayInput;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.util.ByteBufferOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class User1 {
    private String name;
    private Integer num;
    private String col;

    public User1(String name , Integer num , String col){
        this.name = name;
        this.num = num;
        this.col = col;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for num
    public Integer getNum() {
        return num;
    }

    // Setter for num
    public void setNum(Integer num) {
        this.num = num;
    }

    // Getter for col
    public String getCol() {
        return col;
    }

    // Setter for col
    public void setCol(String col) {
        this.col = col;
    }
}


class testt{
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void testt(int x){
        this.x = x;
    }
}

@RestController
@RequestMapping("/api")
public class AvroController {




    private ByteArrayOutputStream cache ;

    @PostMapping("/dummy")
    public ResponseEntity<byte[]> processUser(@RequestBody User1 user1) throws IOException {
        User user = new User(user1.getName() , user1.getNum() , user1.getCol());
        System.out.println(user);
        DatumWriter<User> userDatumWriter = new SpecificDatumWriter<User>(User.class);
        DataFileWriter<User> dataFileWriter = new DataFileWriter<User>(userDatumWriter);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        dataFileWriter.create(user.getSchema(), outputStream);
        dataFileWriter.append(user);
        dataFileWriter.close();
        cache = outputStream;
        return ResponseEntity.ok(outputStream.toByteArray());
    }

    @PostMapping("/same")
    public Map same(@RequestBody Map User) {
        return User;
    }


    @PostMapping("/dummy/deserialize")
    public ResponseEntity<User1> deserializeUser(@RequestBody byte[] data) throws IOException {
        DatumReader<User> userDatumReader = new SpecificDatumReader<User>(User.class);
        try (SeekableByteArrayInput byteArrayInput = new SeekableByteArrayInput(cache.toByteArray());
             DataFileReader<User> dataFileReader = new DataFileReader<>(byteArrayInput, userDatumReader)) {
            User user = null;
            while (dataFileReader.hasNext()) {

                System.out.println("asdasdasdas");
                user = dataFileReader.next();
                System.out.println(user);
            }
            User1 userr = new User1(user.getName().toString() , user.getFavoriteNumber() , user.getFavoriteColor().toString());
            return ResponseEntity.ok(userr);
        }


    }

    @PostMapping("/try")
    public Map tryy (@RequestBody User data) throws IOException {
        User user2 = new User("Ben", 7, "red");

        DatumWriter<User> userDatumWriter = new SpecificDatumWriter<User>(User.class);
        DataFileWriter<User> dataFileWriter = new DataFileWriter<User>(userDatumWriter);
        dataFileWriter.create(user2.getSchema(), new File("classpath:users.avro"));
        dataFileWriter.append(user2);
        dataFileWriter.append(data);
        dataFileWriter.close();

        File file = new File("classpath:users.avro");

        DatumReader<User> userDatumReader = new SpecificDatumReader<User>(User.class);
        DataFileReader<User> dataFileReader = new DataFileReader<User>(file, userDatumReader);
        User user = null;
        while (dataFileReader.hasNext()) {

            System.out.println("asdasdasdas");
            user = dataFileReader.next();
            System.out.println(user);
        }
        Map<String , Object> mp= new HashMap<>();
        mp.put("name" , user.getName());

        mp.put("FavrioteNumber" , user.getFavoriteNumber());
        mp.put("FavrioteColour" , user.getFavoriteColor());
        return mp;
    }

    byte[] limitt;
    @PostMapping("/limitSerilise")
    public ResponseEntity<byte[]> Limits(@RequestBody Limit limit) throws IOException {

        DatumWriter<GenericRecord> datumWriter = new SpecificDatumWriter<>(limit.getSchema());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Encoder encoder = EncoderFactory.get().binaryEncoder(outputStream, null);
        datumWriter.write(limit, encoder);
        encoder.flush();
        outputStream.close();
        System.out.println(Arrays.toString(outputStream.toByteArray()));
        return ResponseEntity.ok(outputStream.toByteArray());
    }

    private Limit l = new Limit();

    public Map<String, Object> objectToMap(Object obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = obj.getClass();

        // Get all fields (including private ones) from the class and its superclasses
//        while (clazz != null) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true); // Make private fields accessible
                Object value = field.get(obj);
                map.put(field.getName(), value);
            }
//            clazz = clazz.getSuperclass(); // Move to superclass for next iteration
//        }

        return map;
    }
    
    
    @PostMapping("/limitDeserilise")
    public String  Limitd(@RequestBody byte[] serializedData) throws IOException, IllegalAccessException {
        DatumReader<GenericRecord> datumReader = new SpecificDatumReader<>(l.getSchema());
        Decoder decoder = DecoderFactory.get().binaryDecoder(serializedData, null);
        GenericRecord deserializedRecord =  datumReader.read(null, decoder);
        System.out.println(deserializedRecord);
        return deserializedRecord.toString();
    }




    @Autowired
    AvroExample avroExample;

    @PostMapping("/test")
    public ResponseEntity<byte[]>  testing(@RequestBody testt o) throws IOException {
        return ResponseEntity.ok(avroExample.calculate(o.getX()));
    }
}
