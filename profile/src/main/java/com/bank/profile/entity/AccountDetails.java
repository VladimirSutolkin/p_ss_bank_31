package com.bank.profile.entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "account_details_id")
public class AccountDetails {





        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        private Long id;

        @Column(name = "account_id", nullable = false)
        private Long accountId;

        @Column(name = "profile_id", nullable = false)
        private Long profileId;

        public AccountDetails() {
        }

        public AccountDetails(Long accountId, Long profileId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountDetails that = (AccountDetails) o;
        return Objects.equals(id, that.id) && Objects.equals(accountId, that.accountId) && Objects.equals(profileId, that.profileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, profileId);
    }
}

