package org.example.OrderListRepo;

import java.time.LocalDate;

public record Order(int bestellnummer, Product produkt, int menge, LocalDate bestelldatum) {
}