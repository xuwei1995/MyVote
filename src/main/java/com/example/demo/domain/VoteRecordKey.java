package com.example.demo.domain;

public class VoteRecordKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_record.vote_record_id
     *
     * @mbg.generated
     */
    private Long voteRecordId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_record.option_id
     *
     * @mbg.generated
     */
    private Long optionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_record.vote_by
     *
     * @mbg.generated
     */
    private Long voteBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_record.vote_record_id
     *
     * @return the value of vote_record.vote_record_id
     *
     * @mbg.generated
     */
    public Long getVoteRecordId() {
        return voteRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_record.vote_record_id
     *
     * @param voteRecordId the value for vote_record.vote_record_id
     *
     * @mbg.generated
     */
    public void setVoteRecordId(Long voteRecordId) {
        this.voteRecordId = voteRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_record.option_id
     *
     * @return the value of vote_record.option_id
     *
     * @mbg.generated
     */
    public Long getOptionId() {
        return optionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_record.option_id
     *
     * @param optionId the value for vote_record.option_id
     *
     * @mbg.generated
     */
    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_record.vote_by
     *
     * @return the value of vote_record.vote_by
     *
     * @mbg.generated
     */
    public Long getVoteBy() {
        return voteBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_record.vote_by
     *
     * @param voteBy the value for vote_record.vote_by
     *
     * @mbg.generated
     */
    public void setVoteBy(Long voteBy) {
        this.voteBy = voteBy;
    }
}