import { View, StyleSheet, Text, Image,} from "react-native";
import React from 'react';
import { TouchableNativeFeedback } from "react-native-gesture-handler";
import { useNavigation } from "@react-navigation/native";

export default function Header() {
    const navigation = useNavigation();

    const handleOnPress = () => {
        navigation.navigate('Home')
    }

    return (
        <>
            <TouchableNativeFeedback onPress={handleOnPress}>
                <View style={styles.container}>
                    <Image source={require('../assets/imgs/logo.png')}/>
                    <Text style={styles.text}>DS Delivery</Text>
                </View>
            </TouchableNativeFeedback>
        </>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#DA5C5C',
        height: 90,
        paddingTop: 50,
        flexDirection: 'row',
        justifyContent: 'center',
    },
    text: {
        fontWeight: 'bold',
        fontSize: 18,
        fontFamily: 'OpenSans_700Bold',
        lineHeight: 25,
        letterSpacing: 0.24,
        color: '#fff',
        marginLeft: 15
    }
})