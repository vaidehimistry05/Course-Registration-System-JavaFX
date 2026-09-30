/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jugal
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Course_Registration_System extends Application {

        @Override
        public void start(Stage primaryStage) {
        
            Label  Title = new Label("Course Registration System");
            Title.setAlignment(Pos.CENTER);
            Title.setStyle(
                "-fx-font-size:38px;" +
                "-fx-text-fill:white;" +
                "-fx-font-weight:bold;" +
                "-fx-effect:dropshadow(gaussian, rgba(0,0,0,0.7), 8,0,0,2);"
            );
                // ===================== YOUR HOME PAGE =====================
            VBox root = new VBox();
            root.setSpacing(20);
            root.setPadding(new Insets(30));
            root.setAlignment(Pos.TOP_CENTER);
        
            Image img1 = new Image("java.jpg");
            ImageView imageView1 = new ImageView(img1);
            imageView1.setFitWidth(180);
            imageView1.setFitHeight(180);

            Label title1 = new Label("Course Name : Java Programming");
            Label duration1 = new Label("Duration : 2 Hours");
            Label professor1 = new Label("Professor : John");
            Label course = new Label("Learn core Java concepts including variables, data types, loops, and functions. "); 
            Label course1 = new Label("Understand Object-Oriented Programming (OOP) concepts such as inheritance, polymorphism, abstraction, and encapsulation. "); 
            Label course2 = new Label("Work with exception handling and collections framework. Build basic console and GUI-based applications using Java.");
            title1.setStyle("-fx-text-fill:#111827; -fx-font-size:16px; -fx-font-weight:bold;");
            VBox details1 = new VBox(title1, duration1, professor1, course, course1, course2);
            details1.setSpacing(8);

            HBox courseCard1 = new HBox(20, imageView1, details1);
            courseCard1.setAlignment(Pos.CENTER_LEFT);
            courseCard1.setStyle(
                        "-fx-background-color: #E8FFEA;" +
                        "-fx-border-radius:30px;" +
                        "-fx-background-radius:30px;" +
                        "-fx-padding:15;" +
                        "-fx-effect:dropshadow(gaussian, rgba(0,0,0,0.6),15,0,0,5);"
            );

            Image img2 = new Image("python.png");
            ImageView imageView2 = new ImageView(img2);
            imageView2.setFitWidth(180);
            imageView2.setFitHeight(180);
           
            Label title2 = new Label("Course Name : Python");
            Label duration2 = new Label("Duration : 2 Hours");
            Label professor2 = new Label("Professor : John");
            Label course5 = new Label("Learn Python fundamentals including syntax, variables, and control structures.Work with functions,"); 
            Label course6 = new Label("lists, dictionaries, and file handling.Understand basic object-oriented programming in Python.Build"); 
            Label course7 = new Label("small automation scripts and beginner-level projects.");
            title2.setStyle("-fx-text-fill:#111827; -fx-font-size:16px; -fx-font-weight:bold;");
            VBox details2 = new VBox(title2, duration2, professor2, course5, course6, course7);
            details2.setSpacing(8);

            HBox courseCard2 = new HBox(20, imageView2, details2);
            courseCard2.setAlignment(Pos.CENTER_LEFT);
            courseCard2.setStyle(
                        "-fx-background-color: #E8FFEA;" +
                        "-fx-border-radius:30px;" +
                        "-fx-background-radius:30px;" +
                        "-fx-padding:15;" +
                        "-fx-effect:dropshadow(gaussian, rgba(0,0,0,0.6),15,0,0,5);"
            );

            Image img3 = new Image("DataScience.jpg");
            ImageView imageView3 = new ImageView(img3);
            imageView3.setFitWidth(180);
            imageView3.setFitHeight(180);

            Label title3 = new Label("Course Name : Data Science");
            Label duration3 = new Label("Duration : 1 Hour");
            Label professor3 = new Label("Professor : Smith");
            Label Course = new Label("Understand the basics of data analysis, data visualization, and statistics.");
            Label Course1 = new Label("Learn how to use tools like Explore data cleaning, transformation, and interpretation techniques.");
            Label Course2 = new Label("Work on real-world datasets to gain practical experience.");
            title3.setStyle("-fx-text-fill:#111827; -fx-font-size:16px; -fx-font-weight:bold;");
            VBox details3 = new VBox(title3, duration3, professor3, Course, Course1, Course2);
            details3.setSpacing(8);

            HBox courseCard3 = new HBox(20, imageView3, details3);
            courseCard3.setAlignment(Pos.CENTER_LEFT);
            courseCard3.setStyle(
                        "-fx-background-color: #E8FFEA;" +
                        "-fx-border-radius:30px;" +
                        "-fx-background-radius:30px;" +
                        "-fx-padding:20;" +
                        "-fx-effect:dropshadow(gaussian, rgba(0,0,0,0.6),25,0,0,5);"        
            );

            Image img4 = new Image("machine_learning.jpg");
            ImageView imageView4 = new ImageView(img4);
            imageView4.setFitWidth(180);
            imageView4.setFitHeight(180);

            Label title4 = new Label("Course Name : Machine Learning");
            Label duration4 = new Label("Duration : 1 Hour");
            Label professor4 = new Label("Professor : Smith");
            Label Course3 = new Label("Learn the fundamentals of machine learning including supervised and unsupervised learning. Understand ");
            Label Course5 = new Label("such as Scikit-learn Build predictive models and evaluate their performance.");
            Label Course4 = new Label("algorithms like linear regression, decision trees, and clustering.Work with Python libraries.");
            title4.setStyle("-fx-text-fill:#111827; -fx-font-size:16px; -fx-font-weight:bold;");
            VBox details4 = new VBox(title4, duration4, professor4, Course3, Course4, Course5);
            details4.setSpacing(8);

            HBox courseCard4 = new HBox(20, imageView4, details4);
            courseCard4.setAlignment(Pos.CENTER_LEFT);
            courseCard4.setStyle(
                        "-fx-background-color:  #E8FFEA;" +
                        "-fx-border-radius:30px;" +
                        "-fx-background-radius:30px;" +
                        "-fx-padding:20;" +
                        "-fx-effect:dropshadow(gaussian, rgba(0,0,0,0.6),25,0,0,5);"
            );

            Image img5 = new Image("dbms.jpg");
            ImageView imageView5 = new ImageView(img5);
            imageView5.setFitWidth(180);
            imageView5.setFitHeight(180);

            Label title5 = new Label("Course Name : Database Management System");
            Label duration5 = new Label("Duration : 1 Hour");
            Label professor5 = new Label("Professor : Smith");
            Label Course6 = new Label("Understand database concepts including ER models, schemas, and normalization. Learn SQL queries");
            Label Course7 = new Label("for data manipulation and retrieval. Explore relational database ");
            Label Course8 = new Label("design and transaction management. %^Work with real database systems like MySQL..");            title5.setStyle("-fx-text-fill:#111827;" + "-fx-font-size:16px;" + "-fx-font-weight:bold;");
            VBox details5 = new VBox(title5, duration5, professor5, Course6, Course7, Course8);
            details5.setSpacing(8);

            HBox courseCard5 = new HBox(20, imageView5, details5);
            courseCard5.setAlignment(Pos.CENTER_LEFT);
            courseCard5.setStyle(
                        "-fx-background-color: #E8FFEA; " +
                        "-fx-border-radius:30px;" +
                        "-fx-background-radius:30px;" +
                        "-fx-padding:20;" +
                        "-fx-effect:dropshadow(gaussian, rgba(0,0,0,0.6),25,0,0,5);"
            );

            Button registerBtn = new Button("🚀  Register Now");
            registerBtn.setStyle(
                    "-fx-background-color: linear-gradient(to right, #3B82F6, #2563EB);" +
                    "-fx-text-fill: white;" +
                    "-fx-font-weight: bold;" +
                    "-fx-font-size: 16px;" +
                    "-fx-background-radius: 14;" +
                    "-fx-padding: 14 45 14 45;" +
                    "-fx-effect: dropshadow(gaussian, rgba(59,130,246,0.6), 20, 0, 0, 6);"
            );
            root.getChildren().addAll(
            Title,
            courseCard1,
            courseCard2,
            courseCard3,
            courseCard4,
            courseCard5,
            registerBtn
            );
            
            root.setStyle(
    "-fx-background-color: linear-gradient(to bottom right, #D0F4F7, #A9E4EC, #7FD8E6);"
            );            
            // ADD SCROLLPANE HERE
            ScrollPane homeScroll = new ScrollPane(root);
            homeScroll.setFitToWidth(true);
            homeScroll.setPannable(true);

            Scene scene = new Scene(homeScroll, 800, 600);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Course Registration System");
            primaryStage.show();

                 // ===================== YOUR REGISTRATION PAGE =====================
            registerBtn.setOnAction(e -> {
            registerBtn.setStyle(
                        "-fx-background-color: linear-gradient(to right, #60A5FA, #3B82F6);" +
                        "-fx-text-fill: white;" +
                        "-fx-font-weight: bold;" +
                        "-fx-font-size: 16px;" +
                        "-fx-background-radius: 14;" +  
                        "-fx-padding: 14 45 14 45;" +
                        "-fx-effect: dropshadow(gaussian, rgba(59,130,246,0.8), 28, 0, 0, 10);"
            );

            VBox registerLayout = new VBox(20);
            registerLayout.setAlignment(Pos.CENTER);
            registerLayout.setPadding(new Insets(30));
            registerLayout.setStyle(
           "-fx-background-color: linear-gradient(to bottom, #243F5F, #0F172A);"
            );
            Label heading = new Label("- : Registration : -");
            heading.setStyle(
                    "-fx-font-size: 30px;" +
                    "-fx-font-weight: bold;" +
                    "-fx-text-fill: black;"
            );

            // ===== NAME ===== //

            Label nameLabel = new Label("Name:"); 
            nameLabel.setPrefWidth(50); 
            TextField nameField = new TextField(); 
            nameField.setPromptText("Enter your full name"); 
            HBox nameRow = new HBox(10, nameLabel, nameField); 
            nameRow.setAlignment(Pos.CENTER_LEFT); 

            // ===== CONTACT =====// 

            Label contactLabel = new Label("Contact No:"); 
            contactLabel.setPrefWidth(50); 
            TextField contactField = new TextField(); 
            contactField.setPromptText("Enter phone number"); 
            HBox contactRow = new HBox(10, contactLabel, contactField);
            contactRow.setAlignment(Pos.CENTER_LEFT); 

           // ===== EMAIL =====//

            Label emailLabel = new Label("Email:"); 
            emailLabel.setPrefWidth(50); 
            TextField emailField = new TextField(); 
            emailField.setPromptText("Enter email address"); 
            HBox emailRow = new HBox(10, emailLabel, emailField);
            emailRow.setAlignment(Pos.CENTER_LEFT);
            nameLabel.setStyle("-fx-text-fill: black;");
            contactLabel.setStyle("-fx-text-fill: black;");
            emailLabel.setStyle("-fx-text-fill: black;");

            // ====== Role ====== //
            Label roleLabel = new Label("Role:");
            roleLabel.setStyle("-fx-text-fill:black;");
            roleLabel.setPrefWidth(120);
            RadioButton studentBtn = new RadioButton("Student");
            RadioButton teacherBtn = new RadioButton("Teacher");
            RadioButton otherBtn   = new RadioButton("Other");
            ToggleGroup roleGroup = new ToggleGroup();
            studentBtn.setToggleGroup(roleGroup);
            teacherBtn.setToggleGroup(roleGroup);
            otherBtn.setToggleGroup(roleGroup); 
            HBox roleButtons = new HBox(16, studentBtn, teacherBtn, otherBtn);
            HBox roleRow = new HBox(10, roleLabel, roleButtons);

            // ===== institute Name ===== //
            Label instituteLabel = new Label("Institute Name:"); 
            instituteLabel.setPrefWidth(50);
            instituteLabel.setStyle("-fx-text-Fill:black");
            TextField instituteField = new TextField(); 
            instituteField.setPromptText("Enter your institute name:"); 
            HBox instituteRow = new HBox(10, instituteLabel, instituteField); 
            instituteRow.setAlignment(Pos.CENTER_LEFT);

            // ===== Education DROPDOWN =====//
            Label EducationLabel = new Label("Education:"); 
            EducationLabel.setPrefWidth(50); 
            ComboBox<String> EducationBox = new ComboBox<>();
            EducationBox.getItems().addAll(
                 "High School (10th)",
                 "HSC / 12th",
                 "Diploma",
                 "Bachelor's Degree",
                 "Master's Degree",
                 "PhD",
                 "Other"
            ); 
            EducationBox.setPromptText("Select"); 
            HBox EducationRow = new HBox(10, EducationLabel, EducationBox); 
            EducationRow.setAlignment(Pos.CENTER_LEFT);
            EducationLabel.setStyle("-fx-text-fill: black;");

            // ===== COURSE DROPDOWN =====//
            Label courseLabel = new Label("Course:");
            courseLabel.setPrefWidth(50); 
            ComboBox<String> courseBox = new ComboBox<>(); 
            courseBox.getItems().addAll(
                        "Java Programming", 
                        "Python Programming",
                        "Data science", 
                        "Machine Learning", 
                        "Database Management System"
            ); 
            courseBox.setPromptText("Select Course"); 
            HBox courseRow = new HBox(10, courseLabel, courseBox);
            courseRow.setAlignment(Pos.CENTER_LEFT); 
            courseLabel.setStyle("-fx-text-fill: black;");
            nameField.setPrefWidth(150);
            contactField.setPrefWidth(150);
            emailField.setPrefWidth(150);
            instituteField.setPrefWidth(150);
            EducationBox.setPrefWidth(150);
            courseBox.setPrefWidth(150);
            nameField.setStyle(
                    "-fx-background-color: #F8FAFC;" +
                    "-fx-background-radius: 8;" +
                    "-fx-border-radius: 8;" +
                    "-fx-padding: 6;"
            );

            contactField.setStyle(
                        "-fx-background-color: #F8FAFC;" +
                        "-fx-background-radius: 8;" +
                        "-fx-border-radius: 8;" +
                        "-fx-padding: 6;"
            );

            emailField.setStyle(
                    "-fx-background-color: #F8FAFC;" +
                    "-fx-background-radius: 8;" +
                    "-fx-border-radius: 8;" +
                    "-fx-padding: 6;"
            );

            instituteField.setStyle(
                    "-fx-background-color: #F8FAFC;" +
                    "-fx-background-radius: 8;" +
                    "-fx-border-radius: 8;" +
                    "-fx-padding: 6;"
            );

            EducationBox.setStyle(
                        "-fx-background-color: #F8FAFC;" +
                        "-fx-background-radius: 8;" +
                        "-fx-border-radius: 8;" +
                        "-fx-padding: 6;"
            );

            courseBox.setStyle(
                    "-fx-background-color: #F8FAFC;" +
                    "-fx-background-radius: 8;" +
                    "-fx-border-radius: 8;" +
                    "-fx-padding: 6;"
            );

                // ===== SUBMIT BUTTON =====// 
            Button submitBtn = new Button("Register"); 
                submitBtn.setStyle(
                        "-fx-background-color: linear-gradient(to right, #3B82F6, #2563EB);" +
                        "-fx-text-fill: white;" +
                        "-fx-font-weight: bold;" +  
                        "-fx-font-size: 14px;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10 30 10 30;" +
                        "-fx-effect: dropshadow(gaussian, rgba(59,130,246,0.5), 18,0,0,5);"
                );

            nameLabel.setPrefWidth(120);
            contactLabel.setPrefWidth(120);
            emailLabel.setPrefWidth(120);
            instituteLabel.setPrefWidth(120);
            EducationLabel.setPrefWidth(120);
            courseLabel.setPrefWidth(120);

            // ===== MAIN FORM LAYOUT =====
            VBox formLayout = new VBox(20,
                    heading,
                    nameRow,
                    roleRow,
                    contactRow,
                    emailRow,
                    instituteRow,
                    EducationRow,
                    courseRow,
                    submitBtn
            );

            formLayout.setPadding(new Insets(30));
            formLayout.setAlignment(Pos.CENTER);
            formLayout.setMaxWidth(400);

            // ===== SCROLL PANE =====
            StackPane centerPane = new StackPane(formLayout);
            centerPane.setAlignment(Pos.CENTER);

            centerPane.setStyle(
    "-fx-background-color: linear-gradient(to bottom right, #D0F4F7, #A9E4EC, #7FD8E6);"
            );  


            primaryStage.setTitle("Registration Page");
            Scene registerScene = new Scene(centerPane, 800, 600);
            primaryStage.setScene(registerScene);

            submitBtn.setOnAction(ev -> {

                submitBtn.setStyle(
                        "-fx-background-color: linear-gradient(to right, #3B82F6, #2563EB);" +
                        "-fx-text-fill: white;" +
                        "-fx-font-weight: bold;" +  
                        "-fx-font-size: 14px;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10 30 10 30;" +
                        "-fx-effect: dropshadow(gaussian, rgba(59,130,246,0.5), 18,0,0,5);"
                );

                String selectedCourse = courseBox.getValue();
                final String name = nameField.getText();
               // Name
                if (nameField.getText().trim().isEmpty()) {
                    new Alert(Alert.AlertType.WARNING, "Please enter your name!").show();
                    return;
                }
                
                if (roleGroup.getSelectedToggle() == null) {
                    new Alert(Alert.AlertType.WARNING, "Please select a role!").show();
                    return;
                }
                
                // Contact (digits only)
                String contact = contactField.getText().trim();
                if (contact.isEmpty() || !contact.matches("\\d+")) {
                    new Alert(Alert.AlertType.WARNING, "Contact number must contain only digits!").show();
                    return;
                }

                // Email (must contain @ and .)
                String email = emailField.getText().trim();
                if (email.isEmpty() || !email.contains("@") || !email.contains(".")) {
                    new Alert(Alert.AlertType.WARNING, "Please enter a valid email (must contain @ and .)!").show();
                    return;
                }

                // Institute
                if (instituteField.getText().trim().isEmpty()) {
                    new Alert(Alert.AlertType.WARNING, "Please enter your institute name!").show();
                    return;
                }

                // Education
                if (EducationBox.getValue() == null) {
                    new Alert(Alert.AlertType.WARNING, "Please select your education level!").show();
                    return;
                }

                // Course
                if (selectedCourse == null) {
                    new Alert(Alert.AlertType.WARNING, "Please select a course!").show();
                    return;
                }

                     // ===================== FILE HANDLING (SAVE DATA) ===================== //
                try {
                        try (FileWriter writer = new FileWriter("students.txt", true)) {
                            String role = "";
                            if (studentBtn.isSelected()) role = "Student";
                                else if (teacherBtn.isSelected()) role = "Teacher";
                                    else if (otherBtn.isSelected()) role = "Other";

                            writer.write(
                                nameField.getText() + "," +
                                            role + "," +
                                            contactField.getText() + "," +
                                            emailField.getText() + "," +
                                            instituteField.getText() + "," +
                                            EducationBox.getValue() + "," +
                                            courseBox.getValue() + "\n"
                            );      
                        }

                        System.out.println("Data Saved Successfully!");
                }
               catch (Exception ex) {
                  ex.printStackTrace();
                }

                // ===================== MY VIDEO PAGE ===================== //
            BorderPane videoLayout = new BorderPane();

            // Top Bar
            Button homeBtn = new Button("Home");
            homeBtn.setStyle("-fx-background-color: orange; -fx-text-fill:white;");
            
            HBox topBar = new HBox(homeBtn);
            topBar.setAlignment(Pos.TOP_RIGHT);
            topBar.setPadding(new Insets(20));

            // Center Content
            VBox centerBox = new VBox(20);
            centerBox.setAlignment(Pos.CENTER);
            Label title = new Label(selectedCourse + " - Video Lecture");
            title.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");
	            String videoPath = "";
            if(selectedCourse.equals("Java Programming")){
                videoPath = "C:\\Users\\jugal\\OneDrive\\Documents\\NetBeansProjects\\Demoofjavafx\\Java_programming_lecture.mp4";
            }
            else if(selectedCourse.equals("Python Programming")){
                videoPath = "C:\\Users\\jugal\\OneDrive\\Documents\\NetBeansProjects\\Demoofjavafx\\python.mp4";
            }
            else if(selectedCourse.equals("Data science")){
                videoPath = "C:\\Users\\jugal\\OneDrive\\Documents\\NetBeansProjects\\Demoofjavafx\\Data_science.mp4";
            }
            else if(selectedCourse.equals("Machine Learning")){
                videoPath = "C:\\Users\\jugal\\OneDrive\\Documents\\NetBeansProjects\\Demoofjavafx\\Machine_learning.mp4";
            }
            else if(selectedCourse.equals("Database Management System")){
                videoPath = "C:\\Users\\jugal\\OneDrive\\Documents\\NetBeansProjects\\Demoofjavafx\\dbms.mp4";
            }
            else{
                System.out.println("No video found for: " + selectedCourse);
            }

            // Safety check before playing
            if(videoPath.isEmpty()){
                System.out.println("Video path is empty. Cannot play video.");
                return;
            }

            // LOCAL VIDEO PLAYER
            String path = new File(videoPath).toURI().toString();

            Media media = new Media(path);
            MediaPlayer player = new MediaPlayer(media);
            MediaView view = new MediaView(player);
                
            // Size
            view.setFitWidth(500);
            view.setFitHeight(500);
            view.setPreserveRatio(true);


            player.setOnError(() -> {
                  System.out.println("ERROR: " + player.getError());
            });

            media.setOnError(() -> {
                  System.out.println("MEDIA ERROR: " + media.getError());
            });
            
            Button playBtn = new Button("▶ Play");
            Button pauseBtn = new Button("⏸ Pause");
            Button stopBtn = new Button("⏹ Stop");

            playBtn.setOnAction(de -> player.play());
            pauseBtn.setOnAction(df -> player.pause());
            stopBtn.setOnAction(ee -> player.stop());

            Button forwardBtn = new Button(">> +10s");
            Button backBtn = new Button("<<-10s");

            forwardBtn.setOnAction(ei ->
                       player.seek(player.getCurrentTime().add(Duration.seconds(10)))
            );
            
            backBtn.setOnAction(ea ->
                    player.seek(player.getCurrentTime().subtract(Duration.seconds(10)))
            );

            Slider slider = new Slider();

            player.currentTimeProperty().addListener((obs, oldTime, newTime) -> {
                    slider.setValue(newTime.toSeconds());
            });

            player.setOnReady(() -> {
                    slider.setMax(player.getTotalDuration().toSeconds());
            });

            slider.setOnMouseReleased(ei -> {
                    player.seek(javafx.util.Duration.seconds(slider.getValue()));
            });
            slider.setMaxWidth(600);

            slider.setStyle(
                   "-fx-control-inner-background: #1D4ED8;" +
                   "-fx-accent: #3B82F6;"
            );
            player.setOnReady(() -> {
                   player.play();   // auto start
                   slider.setMax(player.getTotalDuration().toSeconds());
            });
 
            // Complete Button
            Button completeBtn = new Button("Complete Course");
            completeBtn.setStyle("-fx-background-color: green; -fx-text-fill:white;");

            //  ADD ONLY ONlY
            VBox videoBox = new VBox(view);
            videoBox.setAlignment(Pos.CENTER);
            HBox controls = new HBox(15, backBtn, playBtn, pauseBtn, stopBtn, forwardBtn);
            controls.setAlignment(Pos.CENTER);
            controls.setPadding(new Insets(10));

            controls.setStyle(
                "-fx-background-radius: 10;"
            );
            HBox controlBox = new HBox(15, controls);
            controlBox.setAlignment(Pos.CENTER);

            HBox buttonBox = new HBox(completeBtn);
            buttonBox.setAlignment(Pos.CENTER);
            String btnStyle =
                   "-fx-background-color: linear-gradient(to right, #2563EB, #1D4ED8);" +
                   "-fx-text-fill: white;" +
                   "-fx-font-weight: bold;" +
                   "-fx-background-radius: 8;" +
                   "-fx-padding: 8 15;" +
                   "-fx-cursor: hand;";
            playBtn.setStyle(btnStyle);
            pauseBtn.setStyle(btnStyle);
            stopBtn.setStyle(btnStyle);
            forwardBtn.setStyle(btnStyle);
            backBtn.setStyle(btnStyle);
            centerBox.getChildren().addAll(
                            title,
                            videoBox,
                            slider,
                            controlBox,
                            buttonBox
            );
        
            centerBox.setAlignment(Pos.CENTER);
            centerBox.setSpacing(20);
            centerBox.setPadding(new Insets(20));
            videoLayout.setTop(topBar);
            videoLayout.setCenter(centerBox);
            videoBox.setStyle(
                    "-fx-background-color: black;" +
                    "-fx-padding: 10;" +
                    "-fx-background-radius: 10;"
            );
            Scene videoScene = new Scene(videoLayout, 800, 600);
            primaryStage.setScene(videoScene);

            // Back to Home
            homeBtn.setOnAction(x -> primaryStage.setScene(scene));

                // ===================== MY CONGRATS PAGE =====================
            completeBtn.setOnAction(c -> {
                        player.stop();
                    
                // ================= CERTIFICATE FILE SAVE ================
            try {
                    try (FileWriter writer = new FileWriter("certificate.txt", true)) {
                        writer.write("===== COURSE COMPLETION CERTIFICATE =====\n");
                        writer.write("Name: " + name + "\n");
                        writer.write("Course: " + selectedCourse + "\n");
                        writer.write("Status: Completed Successfully\n");
                        writer.write("----------------------------------------\n");
                    }

                System.out.println("Certificate Generated!");
            }
            catch (Exception ex) {
                   ex.printStackTrace();
            }

            BorderPane congratsLayout = new BorderPane();

            Button homeBtn2 = new Button("Home");
            homeBtn2.setStyle("-fx-background-color: orange; -fx-text-fill:white;");
            
            HBox topBar2 = new HBox(homeBtn2);
            topBar2.setAlignment(Pos.TOP_RIGHT);
            topBar2.setPadding(new Insets(10));
            VBox centerBox2 = new VBox(20);
            centerBox2.setAlignment(Pos.CENTER);

            Label msg = new Label("Congratulations! You completed your course.");
            msg.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");
            
            // DOWNLOAD BUTTON
            Button downloadBtn = new Button("⬇ Download Certificate");
            downloadBtn.setStyle("-fx-background-color: blue; -fx-text-fill:white; -fx-font-size:16px;");

            // CREATE CERTIFICATE ONLY WHEN BUTTON CLICKED
            downloadBtn.setOnAction(d -> {
               try {
                     String course3 = selectedCourse;
                        int width = 1000;
                        int height = 700;

                BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                Graphics2D g = image.createGraphics();

                // Smooth rendering
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Background gradient
                GradientPaint gradient = new GradientPaint(0, 0, new Color(230, 240, 255), width, height, Color.WHITE);
                g.setPaint(gradient);
                g.fillRect(0, 0, width, height);

                // Outer border
                g.setColor(new Color(0, 51, 102));
                g.setStroke(new BasicStroke(8));
                g.drawRect(20, 20, width - 40, height - 40);

                // Inner border
                g.setStroke(new BasicStroke(2));
                g.drawRect(40, 40, width - 80, height - 80);

                // Title
                g.setFont(new Font("Serif", Font.BOLD, 40));
                g.setColor(new Color(0, 0, 102));
                drawCentered(g, "COURSE COMPLETION CERTIFICATE", width, 120);

                // Subtitle
                g.setFont(new Font("Serif", Font.PLAIN, 24));
                g.setColor(Color.BLACK);
                drawCentered(g, "The certificate is awarded to", width, 200);

                // Name
                g.setFont(new Font("Serif", Font.BOLD, 36));
                g.setColor(new Color(153, 0, 0));
                drawCentered(g, name, width, 270);

                // Course line
                g.setFont(new Font("Serif", Font.PLAIN, 24));
                g.setColor(Color.BLACK);
                drawCentered(g, "for successfully completing the course", width, 330);

                //  Course Name
                g.setFont(new Font("Serif", Font.BOLD, 28));
                g.setColor(new Color(0, 102, 0));
                drawCentered(g, course3, width, 390);

                //  Congrats
                g.setFont(new Font("Serif", Font.ITALIC, 22));
                drawCentered(g, " Congratulations!", width, 450);

                //  Date
                String date = java.time.LocalDate.now().toString();
                g.setFont(new Font("Serif", Font.PLAIN, 18));
                g.drawString("Date: " + date, 80, 600);

                // ✍ Signature
                g.drawString("Signature", width - 200, 600);
                g.drawLine(width - 220, 580, width - 80, 580);
                g.dispose();

                // Save file
                String filePath = "C:\\Users\\jugal\\OneDrive\\Documents\\NetBeansProjects\\Demoofjavafx\\"
                                  + name + "_certificate.png";

                File file = new File(filePath);

                javax.imageio.ImageIO.write(image, "png", file);

                // Debug
                System.out.println("Saved at: " + filePath);

                //Open file
                if (file.exists()) {
                    Desktop.getDesktop().open(file);
                } else {
                    System.out.println("File not found!");
                }

                System.out.println("Certificate Created!");
                }
               catch (Exception ex) {
                      ex.printStackTrace();
                        }
                    });

             //ADD TO UI
            centerBox2.getChildren().addAll(msg, downloadBtn);
            
            congratsLayout.setTop(topBar2);
            congratsLayout.setCenter(centerBox2);

            Scene congratsScene = new Scene(congratsLayout, 800, 600);
            primaryStage.setScene(congratsScene);

            homeBtn2.setOnAction(h -> primaryStage.setScene(scene));
                });
            });
        });
    }

public static void main(String[] args) {
        launch(args);
    }

    private void drawCentered(Graphics2D g, String text, int width, int y) {
    java.awt.FontMetrics metrics = g.getFontMetrics();
    int x = (width - metrics.stringWidth(text)) / 2;
    g.drawString(text, x, y);
}
}
