package com.yuhj.springbootmybatis.entity;

public class userWithBLOBs extends user {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ssl_cipher
     *
     * @mbggenerated
     */
    private byte[] sslCipher;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.x509_issuer
     *
     * @mbggenerated
     */
    private byte[] x509Issuer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.x509_subject
     *
     * @mbggenerated
     */
    private byte[] x509Subject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.authentication_string
     *
     * @mbggenerated
     */
    private String authenticationString;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ssl_cipher
     *
     * @return the value of user.ssl_cipher
     *
     * @mbggenerated
     */
    public byte[] getSslCipher() {
        return sslCipher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ssl_cipher
     *
     * @param sslCipher the value for user.ssl_cipher
     *
     * @mbggenerated
     */
    public void setSslCipher(byte[] sslCipher) {
        this.sslCipher = sslCipher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.x509_issuer
     *
     * @return the value of user.x509_issuer
     *
     * @mbggenerated
     */
    public byte[] getX509Issuer() {
        return x509Issuer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.x509_issuer
     *
     * @param x509Issuer the value for user.x509_issuer
     *
     * @mbggenerated
     */
    public void setX509Issuer(byte[] x509Issuer) {
        this.x509Issuer = x509Issuer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.x509_subject
     *
     * @return the value of user.x509_subject
     *
     * @mbggenerated
     */
    public byte[] getX509Subject() {
        return x509Subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.x509_subject
     *
     * @param x509Subject the value for user.x509_subject
     *
     * @mbggenerated
     */
    public void setX509Subject(byte[] x509Subject) {
        this.x509Subject = x509Subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.authentication_string
     *
     * @return the value of user.authentication_string
     *
     * @mbggenerated
     */
    public String getAuthenticationString() {
        return authenticationString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.authentication_string
     *
     * @param authenticationString the value for user.authentication_string
     *
     * @mbggenerated
     */
    public void setAuthenticationString(String authenticationString) {
        this.authenticationString = authenticationString == null ? null : authenticationString.trim();
    }
}