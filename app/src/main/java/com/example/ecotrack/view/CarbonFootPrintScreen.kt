package com.example.ecotrack.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecotrack.R

@Composable
fun CarbonFootprintScreen() {
    val greenColor = Color(0xFF26B171)
    val lightGreen = Color(0xFFE8F5E9)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        // Heading
        Text(
            text = "Carbon Footprint",
            fontSize = 24.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.height(48.dp))

        // Today's screen time
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(48.dp))
            Text(
                text = "Today's screen time: ",
                fontSize = 16.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "258 min",
                fontSize = 16.sp,
                color = greenColor,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Today's data consumption
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(48.dp))
            Text(
                text = "Today's data consumption: ",
                fontSize = 16.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "2.8Gb",
                fontSize = 16.sp,
                color = greenColor,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Today's Carbon Footprint
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_cloud),
                contentDescription = "Cloud",
                tint = greenColor,
                modifier = Modifier.size(36.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Today's Carbon Footprint: ",
                fontSize = 16.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "0.56 kg CO",
                fontSize = 16.sp,
                color = greenColor,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = "2",
                fontSize = 12.sp,
                color = greenColor,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 4.dp)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Divider(color = Color.LightGray)

        Spacer(modifier = Modifier.height(32.dp))

        // Last month's Carbon Footprint
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_cloud),
                contentDescription = "Cloud",
                tint = greenColor,
                modifier = Modifier.size(36.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "last month's Carbon Footprint: ",
                fontSize = 16.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "20.3 kg CO",
                fontSize = 16.sp,
                color = greenColor,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = "2",
                fontSize = 12.sp,
                color = greenColor,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 4.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Equivalent in Plastic Bottles
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_plastic),
                contentDescription = "Plastic",
                tint = greenColor,
                modifier = Modifier.size(36.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Equivalent in Plastic Bottles: ",
                fontSize = 16.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "2L",
                fontSize = 16.sp,
                color = greenColor,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Driving equivalent
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.car),
                contentDescription = "Car",
                tint = greenColor,
                modifier = Modifier.size(36.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "as much as driving: ",
                fontSize = 16.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "X km",
                fontSize = 16.sp,
                color = greenColor,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Divider(color = Color.LightGray)

        // Bottom navigation
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomNavItem(
                icon = painterResource(id = R.drawable.ic_cloud),
                label = "",
                isSelected = true,
                tint = greenColor
            )
            BottomNavItem(
                icon = Icons.Default.LocationOn,
                label = "",
                isSelected = false
            )
            BottomNavItem(
                icon = Icons.Default.DateRange,
                label = "",
                isSelected = false
            )
            BottomNavItem(
                icon = Icons.Default.Notifications,
                label = "",
                isSelected = false
            )
            BottomNavItem(
                icon = Icons.Default.Person,
                label = "",
                isSelected = false
            )
        }
    }
}

@Composable
fun BottomNavItem(
    icon: ImageVector,
    label: String,
    isSelected: Boolean,
    tint: Color = Color.Gray
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            tint = if (isSelected) tint else Color.Gray,
            modifier = Modifier.size(24.dp)
        )
        if (label.isNotEmpty()) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = label,
                color = if (isSelected) tint else Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CarbonFootprintScreenPreview() {
    CarbonFootprintScreen()

}
@Composable
fun BottomNavItem(
    icon: Painter,
    label: String,
    isSelected: Boolean,
    tint: Color = Color.Gray
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = icon,
            contentDescription = label,
            tint = if (isSelected) tint else Color.Gray,
            modifier = Modifier.size(24.dp)
        )
        if (label.isNotEmpty()) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = label,
                color = if (isSelected) tint else Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}
