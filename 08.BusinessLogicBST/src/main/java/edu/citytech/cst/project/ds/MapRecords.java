package edu.citytech.cst.project.ds;

//import com.google.gson.Gson;
import edu.citytech.cst.project.ds.model.Sales;
import edu.citytech.cst.project.ds.model.Student_Exams;
import com.google.gson.Gson;

public class MapRecords {


    public static Sales mapToText(String row) {
        String[] columns = row.split("\\,");


        String branch_Id = columns[0];
        var q1 = Integer.parseInt(columns[1]);
        var q2 = Integer.parseInt(columns[2]);
        var q3 = Integer.parseInt(columns[3]);
        var q4 = Integer.parseInt(columns[4]);


        var sales = new Sales(branch_Id, new Integer[]{q1, q2, q3, q4});
        return sales;
    }
    private static Gson gson = new Gson();
    public static Student_Exams mapToJSON(String json) {

        Student_Exams se = gson.fromJson(json, Student_Exams.class);

        return se;

    }
}
