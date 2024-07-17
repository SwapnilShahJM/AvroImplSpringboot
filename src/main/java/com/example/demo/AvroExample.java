package com.example.demo;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AvroExample {
//    public static void main(String[] args){};
    public byte[]  calculate(int x) throws IOException {
        // Define the Avro schema for an array of strings
        Schema.Parser parser = new Schema.Parser();
        Schema schema = parser.parse("{\"type\":\"array\",\"items\":\"string\"}");

        // Create a list of strings
        List<String> dynamicList = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            dynamicList.add("a");
        }

        Map <String , Integer> res = new HashMap<>();

        // Serialize the list to Avro
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        DatumWriter<List<String>> writer = new SpecificDatumWriter<>(schema);
        writer.write(dynamicList, encoder);
        encoder.flush();
        System.out.println(out.size());
        res.put("Avro" , out.size());
        return out.toByteArray();




//        // Deserialize the Avro bytes back to a list
//        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
//        Decoder decoder = DecoderFactory.get().binaryDecoder(in, null);
//        DatumReader<List<String>> reader = new SpecificDatumReader<>(schema);
//        List<String> deserializedList = reader.read(null, decoder);
//        Map<String , List<String>> mp = new HashMap<>();
//        mp.put("List" , deserializedList);
//
//        System.out.println(mp);
//        res.put("Json" , mp.toString().length());
//
//        // Print the deserialized list
//        System.out.println("Deserialized List: " + deserializedList);
//        return res;

    }
}
