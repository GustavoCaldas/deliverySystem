import { StyleSheet, ScrollView, Text, View } from "react-native";
import React from 'react';
import Header from '../Header';
import OrderCard from "../OrderCard";

export default function Orders() {

    return (
        <>
            <Header />
            <ScrollView style={styles.container}>
                <OrderCard />
                <OrderCard />
                <OrderCard />
                <OrderCard />
                <OrderCard />
                <OrderCard />
            </ScrollView>
        </>
    )
}

const styles = StyleSheet.create({
    container: {
        paddingRight: '5%',
        paddingLeft: '5%',
    }
})