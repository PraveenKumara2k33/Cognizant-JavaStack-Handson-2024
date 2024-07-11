CREATE TABLE BORROWING (
    borrowing_id VARCHAR(10) PRIMARY KEY,
    user_id VARCHAR(10),
    isbn VARCHAR(20),
    borrow_date DATE,
    due_date DATE,
    return_date DATE,
    fine DECIMAL(10,2),
    FOREIGN KEY (user_id) REFERENCES USER(user_id),
    FOREIGN KEY (isbn) REFERENCES BOOK(isbn)
);
