package com.list.groceries.offer.domain;

public class JobOffer {

    String position;
    String salary;

    private JobOffer(String position, String salary) {
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String position;
        private String salary;

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder salary(String salary) {
            this.salary = salary;
            return this;
        }

        public JobOffer build() {
            if (position.isEmpty()) {
                throw new IllegalStateException("Position cannot be empty");
            }
            if (salary.isEmpty()) {
                throw new IllegalStateException("Salary cannot be empty");
            }
            return new JobOffer(position, salary);
        }
    }
}
