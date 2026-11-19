CREATE TABLE IF NOT EXISTS outfits (
    outfit_id INT AUTO_INCREMENT PRIMARY KEY,
    outfit_name CHARACTER(100) NOT NULL,
    weather CHARACTER(50) NOT NULL,
    min_temperature INT NOT NULL,
    max_temperature INT NOT NULL,
    image_url CHARACTER(255)
);