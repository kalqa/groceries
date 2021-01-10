package com.list.groceries.offer.domain;

public class JobOffer {

    String position;
    String salary;
    String description;

    private JobOffer(String position, String salary, String description) {
        this.position = position;
        this.salary = salary;
        this.description = description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String position;
        private String salary;
        private String description;

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder salary(String salary) {
            this.salary = salary;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public JobOffer build() {
            if (position.isEmpty()) {
                throw new IllegalStateException("Position cannot be empty");
            }
            if (salary.isEmpty()) {
                throw new IllegalStateException("Salary cannot be empty");
            }
            if (description.isEmpty()) {
                throw new IllegalStateException("Salary cannot be empty");
            }
            return new JobOffer(position, salary, description);
        }
    }
}
