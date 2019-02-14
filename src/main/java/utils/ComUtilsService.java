package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ComUtilsService {
    private ComUtils comUtils;

    public ComUtilsService(InputStream inputStream, OutputStream outputStream) throws IOException {
        comUtils = new ComUtils(inputStream, outputStream);
    }

    public void writeTest() {
        try {
            comUtils.write_string("Joaquim Comes");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            comUtils.write_int32(23);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            comUtils.write_string_variable(3, "12345678901234567890liuvhdoljfg");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public String readTest() {
        String result = "";
        try {
            result = result + comUtils.read_string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            result = result + comUtils.read_int32();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            result = result+ comUtils.read_string_variable(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }



}
