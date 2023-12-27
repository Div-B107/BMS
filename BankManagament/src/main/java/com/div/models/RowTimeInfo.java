package com.div.models;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class RowTimeInfo {
    @Column(name = "createdAt", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "updateAt", nullable = false)
    private LocalDateTime updateAt;

    public RowTimeInfo() {
        this.createdAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "RowTimeInfo{" +
                "createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
