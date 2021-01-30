import { StyleSheet, ScrollView, Text, View, Alert } from "react-native";
import React, { useEffect, useState } from 'react';
import Header from '../Header';
import OrderCard from "../OrderCard";
import { fetchOrders } from "../api";
import { Order } from "../types";
import { TouchableWithoutFeedback } from "react-native-gesture-handler";
import { useIsFocused, useNavigation } from "@react-navigation/native";

export default function Orders() {
    const  [orders, setOrders] = useState<Order[]>([]);
    const [isLoadinng, setIsLoading] = useState(false);
    const navigation = useNavigation();
    const isFocused = useIsFocused();

    const fecthData = () => {
        setIsLoading(true);
        fetchOrders()
            .then( response => setOrders( response.data ))
            .catch( () => Alert.alert("Houve um erro ao consultar pedidos!"))
            .finally( () => setIsLoading(false));
    } 
    useEffect(() => { 
        if (isFocused) {
            fecthData();
        }
    }, [isFocused]);

    const handleOnPress = (order : Order) => {
        navigation.navigate('OrdersDetails', {
            order
        })
    }

    return (
        <>
            <Header />
            <ScrollView style={styles.container}>
                {isLoadinng ? (
                    <Text>Buscando pedidos...</Text>
                ) : (
                    orders.map( order => (
                        <TouchableWithoutFeedback 
                            key={order.id} 
                            onPress={() => handleOnPress(order)}
                        >
                            <OrderCard order={order}/>
                        </TouchableWithoutFeedback>
                    ))
                )}
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