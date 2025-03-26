package foodrate.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import foodrate.ui.theme.OnPrimary
import foodrate.ui.theme.Primary


@Composable
fun MyButton(
    text: String, // Texto do botão
    onClick: () -> Unit, // Ação a ser executada ao clicar
    modifier: Modifier = Modifier // Modificador opcional para personalização
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Primary, // Cor de fundo do botão
            contentColor = OnPrimary// Cor do texto e ícone
        ),
        modifier = modifier
            .width(200.dp)
            .height(60.dp)
            .padding(5.dp)


    ) {
        Text(
            text = text,
            fontSize = 20.sp
        )
    }

}
