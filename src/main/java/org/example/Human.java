package org.example;


    class Human implements Comparable<Human> {
        private int id;
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private String gender;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String gender() {
            return gender;
        }

        public Human(String firstName, String middleName, String lastName, int age, String gender) {
            this.firstName = formatString(firstName);
            this.middleName = formatString(middleName);
            this.lastName = formatString(lastName);
            this.age = formatInt(age);
            this.gender = formatString(gender);
        }

        private String formatString(String name) {
            String result = name != null ? name.trim() : "";
            if (result.length() > 0) {
                result = String.format("%s%s", Character.toUpperCase(result.charAt(0)), result.substring(1, result.length()).toLowerCase());
            }
            return result;
        }

        private int formatInt(int number) {
            return number < 0 ? 0 : number;
        }

        public String getFullName() {
            return String.format("%s %s %s", this.firstName, this.middleName, this.lastName);
        }

        @Override
        public int compareTo(Human o) {
            return o != null ? this.getFullName().compareTo(o.getFullName()) : 0;
        }

        @Override
        public String toString() {
            return String.format("ID: %d; Full name: %s; age: %d; clothing size: %d;", this.id, this.getFullName(), this.age, this.gender);
        }
    }

