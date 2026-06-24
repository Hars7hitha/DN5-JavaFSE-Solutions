SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT c.CustomerID,
               l.LoanID,
               l.InterestRate,
               FLOOR(MONTHS_BETWEEN(SYSDATE,c.DOB)/12) Age
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID=l.CustomerID
    )
    LOOP

        IF rec.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount Applied to Customer '
                || rec.CustomerID
            );

        END IF;

    END LOOP;

    COMMIT;

END;
/