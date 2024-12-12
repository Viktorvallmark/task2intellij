package party_Viktor_Vallmark.partyModel;

/* Author: Viktor Vallmark
 * Computer id: aq2560
 * Program: Datateknik
 *
 *
 *
 * */

public class Address {
  /*
   * Declare instance variables for street, city, zip code as String-objects
   * and country by using the enum Countries
   */

  private String street;
  private String city;
  private String zipCode;
  private Countries country;

  /*
   * Write a default constructor (with no parameters) that gives default values
   * for instance variables.
   * Set default values for instance variables by calling the other constructor
   * below using the this reserved word and:
   * - Alternative 1: with arguments that are default values
   * of your choice that will inform a user that this value isn't really set.
   * - Alternative 2: Use null for all arguments and call the constructor below
   * and handle that there.
   */
  public Address() {
    this("Fakestreet", "Fakecity", "Fakezipcode", Countries.Unknown);
  }

  /*
   * Write a constructor with parameters for all instance variables
   * given above. Set instance variables to values from parameters.
   *
   * Check that the values for the parameters street, zipCode and city
   * isn't empty strings or null before assigning the values to the
   * corresponding instance variables.
   *
   * If any value is empty or null assign a default value of your choice
   * that will inform a user that this value isn't really set.
   *
   * If the parameter country is null set this to Countries.Unknown
   */
  public Address(String street, String city, String zipCode, Countries country) {

    if ((street == null) || street.isEmpty()) {
      this.street = "Fakestreet inside constructor with parameters";
    } else {
      this.street = street;
    }

    if ((city == null) || city.isEmpty()) {
      this.city = "Fakecity inside constructor with parameters";
    } else {
      this.city = city;
    }

    if ((zipCode == null) || zipCode.isEmpty()) {
      this.zipCode = "Fakezipcode inside constructor with parameters";
    } else {
      this.zipCode = zipCode;
    }

    if (country == null) {
      this.country = Countries.Unknown;
    } else {
      this.country = country;
    }
  }

  /*
   * Implement get- and set-methods for all instance variables.
   * Remember to check parameters in set-methods with the same
   * rules as in the constructor above.
   */
  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public Countries getCountry() {
    return country;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setCity(String city) {

    if ((city == null) || city.isEmpty()) {
      this.city = "Fakecity";
    } else {
      this.city = city;
    }
  }

  public void setStreet(String street) {

    if ((street == null) || street.isEmpty()) {
      this.street = "Fakestreet";
    } else {
      this.street = street;
    }
  }

  public void setCountry(Countries country) {

    if (country == null) {
      this.country = Countries.Unknown;
    } else {
      this.country = country;
    }
  }

  public void setZipCode(String zipCode) {

    if ((zipCode == null) || zipCode.isEmpty()) {
      this.zipCode = "Fakezipcode";
    } else {
      this.zipCode = zipCode;
    }
  }

  /*
   * Write a toString method to return a String-object made of the address
   * details,
   * formatted as one line (this will be shown in the window under
   * "Guest Register" ).
   */

  @Override
  public String toString() {
    return "Street: "
        + this.street
        + " City: "
        + this.city
        + " Zip Code: "
        + this.zipCode
        + " Country: "
        + this.country;
  }
}
