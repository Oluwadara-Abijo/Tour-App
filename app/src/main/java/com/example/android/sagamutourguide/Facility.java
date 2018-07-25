package com.example.android.sagamutourguide;

/**
 * Created by Oluwadara on 22-Mar-18.
 */

public class Facility {

    //Name of facility
    private String mFacilityName;

    //Address of facility
    private String mFacilityAddress;

    //Description of facility
    private String mFacilityDescription;

    //Background image of facility
    private int mFacilityImage;

    //Gallery of facility
    private int mGalleryOne, mGalleryTwo, mGalleryThree, mGalleryFour;

    //Opening hours of facility
    private String mFacilityOpeningHours = NO_HOURS_REQUIRED;

    private static final String NO_HOURS_REQUIRED = "NO HOURS";

    //Contact of facility
    private String mFacilityContact = NO_CONTACT_REQUIRED;

    private static final String NO_CONTACT_REQUIRED = "NO CONTACT";

    //Facility price (for hotels)
    private String mFacilityPrice = NO_PRICE_REQUIRED;

    private static final String NO_PRICE_REQUIRED = "NO PRICE";

    //Available amenities in facility(for hotels)
    private String mAvailableAmenities = NO_AMENITIES_REQUIRED;

    private static final String NO_AMENITIES_REQUIRED = "NO AMENITIES";

    //Define constructor (for hotels)
    public Facility(String facilityName, String facilityAddress, String facilityPrice,
                    String facilityDescription, String facilityOpeningHours, String facilityContact,
                    String availableAmenities, int facilityImage, int galleryOne, int galleryTwo,
                    int galleryThree, int galleryFour){
        mFacilityName = facilityName;
        mFacilityAddress = facilityAddress;
        mFacilityPrice = facilityPrice;
        mFacilityDescription = facilityDescription;
        mFacilityOpeningHours = facilityOpeningHours;
        mFacilityContact = facilityContact;
        mAvailableAmenities = availableAmenities;
        mFacilityImage = facilityImage;
        mGalleryOne = galleryOne;
        mGalleryTwo = galleryTwo;
        mGalleryThree = galleryThree;
        mGalleryFour = galleryFour;
    }

    //Define constructor2 (for restaurants and shopping store)
    public Facility(String facilityName, String facilityAddress, String facilityDescription,
                    String facilityOpeningHours, String facilityContact, int facilityImage) {
        mFacilityName = facilityName;
        mFacilityAddress = facilityAddress;
        mFacilityDescription = facilityDescription;
        mFacilityOpeningHours = facilityOpeningHours;
        mFacilityContact = facilityContact;
        mFacilityImage = facilityImage;
    }

    //Define constructor3 (for markets)
    public Facility(String facilityName, String facilityAddress, String facilityDescription,
                    String facilityOpeningHours, int facilityImage) {
        mFacilityName = facilityName;
        mFacilityAddress = facilityAddress;
        mFacilityDescription = facilityDescription;
        mFacilityOpeningHours = facilityOpeningHours;
        mFacilityImage = facilityImage;
    }

    //Define constructor4 (for office category)
    public Facility(String facilityName, String facilityAddress, String facilityDescription, int facilityImage) {
        mFacilityName = facilityName;
        mFacilityAddress = facilityAddress;
        mFacilityDescription = facilityDescription;
        mFacilityImage = facilityImage;
    }

    //Get the name of facility
    public String getFacilityName() {
        return mFacilityName;
    }

    //Get address of facility
    public String getFacilityAddress() {return mFacilityAddress;
    }

    //Get background image of facility
    public int getFacilityImage() {return mFacilityImage;}

    public int getGallery_one() {
        return mGalleryOne;
    }

    public int getGallery_two() {
        return mGalleryTwo;
    }

    public int getGallery_three() {
        return mGalleryThree;
    }

    public int getGallery_four() {
        return mGalleryFour;
    }

    //Get description of facility
    public String getFacilityDescription() {return mFacilityDescription;}

    //Get opening hours of facility
    public String getFacilityOpeningHours() {return mFacilityOpeningHours;}

    //Get contact of facility
    public String getFacilityContact() {return mFacilityContact;}

    //Get price of facility
    public String getFacilityPrice() {return mFacilityPrice;}

    /**
     * Returns whether or not there is a price for this facility
     * @return
     **/
    public boolean hasPrice() {
        return mFacilityPrice != NO_PRICE_REQUIRED;
    }

    /**
     * Returns whether or not there is a contact for this facility
     * @return
     **/
    public boolean hasContact() {
        return mFacilityContact != NO_CONTACT_REQUIRED;
    }

    /**
     * Returns whether or not there is opening hours for this facility
     * @return
     **/
    public boolean hasOpeningHours() {
        return mFacilityOpeningHours != NO_HOURS_REQUIRED;
    }

    /**
     * Returns whether or not there are available amenities for this facility
     * @return
     **/
    public boolean hasAvailableAmenities() {
        return mAvailableAmenities != NO_AMENITIES_REQUIRED;
    }
}
