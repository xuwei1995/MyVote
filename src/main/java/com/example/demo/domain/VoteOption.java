package com.example.demo.domain;

public class VoteOption {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_option.vote_option_id
     *
     * @mbg.generated
     */
    private Long voteOptionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_option.vote_id
     *
     * @mbg.generated
     */
    private Long voteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_option.option_value
     *
     * @mbg.generated
     */
    private String optionValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_option.vote_option_id
     *
     * @return the value of vote_option.vote_option_id
     *
     * @mbg.generated
     */
    public Long getVoteOptionId() {
        return voteOptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_option.vote_option_id
     *
     * @param voteOptionId the value for vote_option.vote_option_id
     *
     * @mbg.generated
     */
    public void setVoteOptionId(Long voteOptionId) {
        this.voteOptionId = voteOptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_option.vote_id
     *
     * @return the value of vote_option.vote_id
     *
     * @mbg.generated
     */
    public Long getVoteId() {
        return voteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_option.vote_id
     *
     * @param voteId the value for vote_option.vote_id
     *
     * @mbg.generated
     */
    public void setVoteId(Long voteId) {
        this.voteId = voteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_option.option_value
     *
     * @return the value of vote_option.option_value
     *
     * @mbg.generated
     */
    public String getOptionValue() {
        return optionValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_option.option_value
     *
     * @param optionValue the value for vote_option.option_value
     *
     * @mbg.generated
     */
    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue == null ? null : optionValue.trim();
    }
}