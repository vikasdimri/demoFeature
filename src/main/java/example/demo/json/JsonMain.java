package example.demo.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonMain {

    public static void main(String[] args) {
        try {
            /*JsonSample sample = new JsonSample("Vikas",
                    "Dimri");*/
            ObjectMapper objectMapper = new ObjectMapper();

            /*objectMapper.writeValue(new File("/Users/vdimri/sample/sample.json"), sample);*/


            //JSON from file to Object
            JsonSample sample1 = objectMapper.readValue(new File("/Users/vdimri/sample/sample.json"), JsonSample.class);
            System.out.println(sample1.toString());

            if(sample1.address==null){
                System.out.println("==================NULL==========================");
            }else {
                System.out.println("==================Not NULL==========================");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
