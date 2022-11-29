package de.neuefische.smartphone;

public class BusinessContact extends Contact{
    String companyName;

    @Override
    String getName() {
        return null;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
