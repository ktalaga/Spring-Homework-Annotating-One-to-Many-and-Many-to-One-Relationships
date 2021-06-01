package com.example.files.files.components;

import com.example.files.files.models.File;
import com.example.files.files.models.Folder;
import com.example.files.files.models.User;
import com.example.files.files.repositories.FileRepository;
import com.example.files.files.repositories.FolderRepository;
import com.example.files.files.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        User user_1 = new User("Konrad Talaga");
        userRepository.save(user_1);

        User user_2 = new User("Ozzy Osbourne");
        userRepository.save(user_2);

        Folder folder_1 = new Folder("notes", user_1);
        Folder folder_2 = new Folder("movies", user_1);
        Folder folder_3 = new Folder("pictures", user_2);
        folderRepository.save(folder_1);
        folderRepository.save(folder_2);
        folderRepository.save(folder_3);

        File file_1 = new File("python", ".txt", 12, folder_1);
        File file_2 = new File("java", ".pdf", 22, folder_1);
        File file_3 = new File("javascript", ".pdf", 32, folder_1);
        File file_4 = new File("matrix", ".vid", 320, folder_2);
        File file_5 = new File("matrix_2", ".vid", 325, folder_2);
        File file_6 = new File("matrix_3", ".vod", 326, folder_2);
        File file_7 = new File("barcelona", ".jpg", 121, folder_3);
        File file_8 = new File("paris", ".jpg", 133, folder_3);
        File file_9 = new File("rome", ".png", 143, folder_3);
        fileRepository.save(file_1);
        fileRepository.save(file_2);
        fileRepository.save(file_3);
        fileRepository.save(file_4);
        fileRepository.save(file_5);
        fileRepository.save(file_6);
        fileRepository.save(file_7);
        fileRepository.save(file_8);
        fileRepository.save(file_9);

        user_1.addFolder(folder_1);
        user_1.addFolder(folder_2);

        user_2.addFolder(folder_3);

        folder_1.addFile(file_1);
        folder_1.addFile(file_2);
        folder_1.addFile(file_3);

        folder_2.addFile(file_4);
        folder_2.addFile(file_5);
        folder_2.addFile(file_6);

        folder_3.addFile(file_7);
        folder_3.addFile(file_8);
        folder_3.addFile(file_9);

    }
}
