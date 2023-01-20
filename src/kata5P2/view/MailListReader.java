package kata5P2.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;
import static kata4.model.Mail.isEmail;

public class MailListReader {
    private final List<String> domainsList = new ArrayList();
    
    public List<String> addDomains(List<Mail> items){
        for (Mail line : items) {
            domainsList.add(line.getDomain());
        }
        return domainsList;
    }
    
    public List<Mail> read(String fileName){

        List<Mail> mailList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));

            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                if (isEmail(line)) mailList.add(new Mail(line));
            }  
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return mailList;
    }
}
