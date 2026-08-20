package org.example.dio.ordem;

import java.util.Objects;

public class Email implements Comparable<Email>{
    private String email;

    public String getEmail() {
        return email;
    }

    public Email(String emal) {
        this.email = emal;
    }

    @Override
    public String toString() {
        return "email{" +
                "emal='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(this.email, email.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public int compareTo(Email outro) {
        return this.email.compareTo(outro.getEmail());
    }
}
