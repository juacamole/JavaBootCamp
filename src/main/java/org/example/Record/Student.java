package org.example.Record;
import lombok.*;

import java.nio.file.FileStore;

@Getter @Setter
public class Student {
    private String id;
    private String name;
    private int age;

    public static FileStore builder() {
        return null;
    }
}
