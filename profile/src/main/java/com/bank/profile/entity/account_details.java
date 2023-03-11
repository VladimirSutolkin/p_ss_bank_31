package com.bank.profile.entity;
import javax.persistence.*;

public class account_details {



  @javax.persistence.Entity
    @Table(name = "account_details_id")
    public class Entity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        private Long id;

        @Column(name = "account_id", nullable = false)
        private Long accountId;

        @Column(name = "profile_id", nullable = false)
        private Long profileId;

        public Entity() {
        }

        public Entity(Long accountId, Long profileId) {
            this.accountId = accountId;
            this.profileId = profileId;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getAccountId() {
            return accountId;
        }

        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        public Long getProfileId() {
            return profileId;
        }

        public void setProfileId(Long profileId) {
            this.profileId = profileId;
        }
    }
}
