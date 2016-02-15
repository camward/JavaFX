package table.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import table.pojo.User;

import javafx.scene.control.TableColumn;

public class Controller {

    private ObservableList<User> usersData = FXCollections.observableArrayList();

    @FXML
    private TableView<User> tableUsers;

    @FXML
    private TableColumn<User, Integer> idColumn;

    @FXML
    private TableColumn<User, String> loginColumn;

    @FXML
    private TableColumn<User, String> passwordColumn;

    @FXML
    private TableColumn<User, String> emailColumn;

    @FXML
    private void initialize() {
        initData();
        idColumn.setCellValueFactory(new PropertyValueFactory<User, Integer>("id"));
        loginColumn.setCellValueFactory(new PropertyValueFactory<User, String>("login"));
        passwordColumn.setCellValueFactory(new PropertyValueFactory<User, String>("password"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<User, String>("email"));

        tableUsers.setItems(usersData);
    }

    private void initData() {
        usersData.add(new User(1, "Alex", "qwerty", "alex@mail.com"));
        usersData.add(new User(2, "Bob", "dsfsdfw", "bob@mail.com"));
        usersData.add(new User(3, "Jeck", "dsfdsfwe", "Jeck@mail.com"));
        usersData.add(new User(4, "Mike", "iueern", "mike@mail.com"));
        usersData.add(new User(5, "colin", "woeirn", "colin@mail.com"));
        usersData.add(new User(6, "Alex", "qwerty", "alex@mail.com"));
        usersData.add(new User(7, "Bob", "dsfsdfw", "bob@mail.com"));
        usersData.add(new User(8, "Jeck", "dsfdsfwe", "Jeck@mail.com"));
        usersData.add(new User(9, "Mike", "iueern", "mike@mail.com"));
        usersData.add(new User(10, "colin", "woeirn", "colin@mail.com"));
        usersData.add(new User(11, "Alex", "qwerty", "alex@mail.com"));
        usersData.add(new User(12, "Bob", "dsfsdfw", "bob@mail.com"));
        usersData.add(new User(13, "Jeck", "dsfdsfwe", "Jeck@mail.com"));
        usersData.add(new User(14, "Mike", "iueern", "mike@mail.com"));
        usersData.add(new User(15, "colin", "woeirn", "colin@mail.com"));
    }

}