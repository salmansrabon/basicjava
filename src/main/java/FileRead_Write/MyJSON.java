package FileRead_Write;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.xml.transform.Templates;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyJSON {
    public static void main(String[] args) throws IOException, ParseException {
        //writeJSON();
        //readJSON();
        writeJSONList();
        //readJSONList(2);
        //updateJSONList(0);
        //deleteJSONList(0);
    }

    public static void writeJSON() throws IOException {
        JSONObject empObj = new JSONObject();
        empObj.put("name", "Mr. Rafig");
        empObj.put("Department", "IT");
        empObj.put("Designation", "Software Engineer");
        JSONObject addressObj = new JSONObject();
        addressObj.put("Area", "Gulshan");
        addressObj.put("PO", "Gulshan-1");
        addressObj.put("City", "Dhaka");
        empObj.put("address", addressObj);

        //System.out.println(empObj);
        FileWriter writer = new FileWriter("employee.json");
        writer.write(empObj.toJSONString());
        writer.flush();
        writer.close();
    }

    public static void readJSON() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("employee.json"));
        JSONObject empObj = (JSONObject) obj;
        System.out.println(empObj);
        String name = (String) empObj.get("name");
        System.out.println(name);
        String department = (String) empObj.get("Department");
        System.out.println(department);
        String designation = (String) empObj.get("Designation");
        System.out.println(designation);
        JSONObject addressObj = (JSONObject) empObj.get("address");
        System.out.println(addressObj);
        String area = (String) addressObj.get("Area");
        System.out.println(area);
        String po = (String) addressObj.get("PO");
        System.out.println(po);
        String city = (String) addressObj.get("City");
        System.out.println(city);
    }

    public static void writeJSONList() throws IOException, ParseException {
        char ch;
        String fileName = "student.json";
        do {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject studentObj = new JSONObject();

            Scanner input = new Scanner(System.in);
            System.out.println("Input student name: ");
            studentObj.put("name", input.nextLine());
            System.out.println("Input class: ");
            studentObj.put("class", input.nextLine());
            System.out.println("Input section: ");
            studentObj.put("section", input.nextLine());
            System.out.println("Input roll: ");
            studentObj.put("roll", input.nextLine());

            JSONArray jsonArray = (JSONArray) obj;
            //System.out.print(jsonArray);
            jsonArray.add(studentObj);
            FileWriter file = new FileWriter(fileName);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();
            System.out.println("Saved!");
            System.out.print(jsonArray);
            System.out.println("\nDo you want to add more?[y/n]");
            ch = input.next().charAt(0);

        }
        while(ch!='n');
    }
    public static void readJSONList(int pos) throws IOException, ParseException {
        String fileName="student.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        JSONObject jsonObject = (JSONObject) jsonArray.get(pos);
        //System.out.println(json);

        String name = (String) jsonObject.get("name");
        String roll = (String) jsonObject.get("roll");
        String section = (String) jsonObject.get("section");
        String _class = (String) jsonObject.get("class");
        System.out.println(name);
        System.out.println(roll);
        System.out.println(section);
        System.out.println(_class);
    }
    public static void updateJSONList(int pos) throws IOException, ParseException {
        String fileName="student.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        JSONObject jsonObject = (JSONObject) jsonArray.get(pos);
        jsonObject.put("class","9");
        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
        System.out.println("Saved!");
        System.out.print(jsonArray);
    }
    public static void deleteJSONList(int pos) throws IOException, ParseException {
        String fileName="student.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        jsonArray.remove(pos);
        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
        System.out.println("Saved!");
        System.out.print(jsonArray);
    }
}

