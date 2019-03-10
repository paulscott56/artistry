package artistry.models;

import com.opencsv.bean.CsvBindByPosition;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class PersonCsv {

    @Id
    @GeneratedValue
    private Long id;

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @CsvBindByPosition(position = 0)
    private String name;
    @CsvBindByPosition(position = 1)
    private String surname;
    @CsvBindByPosition(position = 2)
    private String username;
    @CsvBindByPosition(position = 3)
    private String nickname;
    @CsvBindByPosition(position = 4)
    private String countryCode;
    @CsvBindByPosition(position = 5)
    private String workemail;
    @CsvBindByPosition(position = 6)
    private String personalEmail;
    @CsvBindByPosition(position = 7)
    private String workPhone;
    @CsvBindByPosition(position = 8)
    private String mobilePhone;
    @CsvBindByPosition(position = 9)
    private String address;
    @CsvBindByPosition(position = 10)
    private boolean active;
    @CsvBindByPosition(position = 11)
    private String jiraUsername;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getWorkemail() {
        return workemail;
    }

    public void setWorkemail(String workemail) {
        this.workemail = workemail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJiraUsername() {
        return jiraUsername;
    }

    public void setJiraUsername(String jiraUsername) {
        this.jiraUsername = jiraUsername;
    }
}
