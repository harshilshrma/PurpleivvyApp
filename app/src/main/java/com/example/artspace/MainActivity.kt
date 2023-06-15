package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    var currentStep by remember { mutableStateOf(1) }
    when (currentStep) {
        1 -> {
            ArtSpaceStartPage(onButtonClick = { currentStep++ })
        }
        2 -> {
            ArtSpaceImageAndText(
                title = R.string.art1_title,
                description = R.string.art1_description,
                art = R.drawable.art1_wanderer,
                backgroundImage = R.drawable.art1_bg,
                buttonColor = Color(0xFF0e2a55),
                textColor = Color(0xFF000000),
                imageContentDescription = R.string.art1_imageContentDescription,
                onNextClick = { currentStep++ },
                onPreviousClick = { currentStep-- })
        }
        3 -> {
            ArtSpaceImageAndText(
                title = R.string.art2_title,
                description = R.string.art2_description,
                art = R.drawable.art2_makima,
                backgroundImage = R.drawable.art2_bg,
                buttonColor = Color(0xFFc80000),
                textColor = Color(0xFFFFFFFF),
                imageContentDescription = R.string.art2_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        4 -> {
            ArtSpaceImageAndText(
                title = R.string.art3_title,
                description = R.string.art3_description,
                art = R.drawable.art3_dragon,
                backgroundImage = R.drawable.art3_bg,
                buttonColor = Color(0xFF000000),
                textColor = Color(0xFF000000),
                imageContentDescription = R.string.art3_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        5 -> {
            ArtSpaceImageAndText(
                title = R.string.art4_title,
                description = R.string.art4_description,
                art = R.drawable.art4_bluehairgirl,
                backgroundImage = R.drawable.art4_bg,
                buttonColor = Color(0xFF0a0d62),
                textColor = Color(0xFFFFFFFF),
                imageContentDescription = R.string.art4_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        6 -> {
            ArtSpaceImageAndText(
                title = R.string.art5_title,
                description = R.string.art5_description,
                art = R.drawable.art5_shoes,
                backgroundImage = R.drawable.art5_bg,
                buttonColor = Color(0xFF7b1fd1),
                textColor = Color(0xFFd1a0e7),
                imageContentDescription = R.string.art5_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        7 -> {
            ArtSpaceImageAndText(
                title = R.string.art6_title,
                description = R.string.art6_description,
                art = R.drawable.art6_flowerlady,
                backgroundImage = R.drawable.art6_bg,
                buttonColor = Color(0xFF473267),
                textColor = Color(0xFF473267),
                imageContentDescription = R.string.art6_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        8 -> {
            ArtSpaceImageAndText(
                title = R.string.art7_title,
                description = R.string.art7_description,
                art = R.drawable.art7_tighnari,
                backgroundImage = R.drawable.art7_bg,
                buttonColor = Color(0xFF4b6849),
                textColor = Color(0xFFe8eed0),
                imageContentDescription = R.string.art7_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        9 -> {
            ArtSpaceImageAndText(
                title = R.string.art8_title,
                description = R.string.art8_description,
                art = R.drawable.art8_yourname,
                backgroundImage = R.drawable.art8_bg,
                buttonColor = Color(0xFF121b3a),
                textColor = Color(0xFFfcc7c3),
                imageContentDescription = R.string.art8_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        10 -> {
            ArtSpaceImageAndText(
                title = R.string.art9_title,
                description = R.string.art9_description,
                art = R.drawable.art9_brendon,
                backgroundImage = R.drawable.art9_bg,
                buttonColor = Color(0xFF510f5b),
                textColor = Color(0xFFbdd5d2),
                imageContentDescription = R.string.art9_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        11 -> {
            ArtSpaceImageAndText(
                title = R.string.art10_title,
                description = R.string.art10_description,
                art = R.drawable.art10_peeking,
                backgroundImage = R.drawable.art10_bg,
                buttonColor = Color(0xFF33375a),
                textColor = Color(0xFFb5c2d1),
                imageContentDescription = R.string.art10_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        12 -> {
            ArtSpaceImageAndText(
                title = R.string.art11_title,
                description = R.string.art11_description,
                art = R.drawable.art11_violetevergarden,
                backgroundImage = R.drawable.art11_bg,
                buttonColor = Color(0xFF7a7b7a),
                textColor = Color(0xFF252525),
                imageContentDescription = R.string.art11_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        13 -> {
            ArtSpaceImageAndText(
                title = R.string.art12_title,
                description = R.string.art12_description,
                art = R.drawable.art12_osuamaranking,
                backgroundImage = R.drawable.art12_bg,
                buttonColor = Color(0xFF2c312a),
                textColor = Color(0xFFd2d1ca),
                imageContentDescription = R.string.art12_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        14 -> {
            ArtSpaceImageAndText(
                title = R.string.art13_title,
                description = R.string.art13_description,
                art = R.drawable.art13_cup,
                backgroundImage = R.drawable.art13_bg,
                buttonColor = Color(0xFF604e6f),
                textColor = Color(0xFFFFFFFF),
                imageContentDescription = R.string.art13_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        15 -> {
            ArtSpaceImageAndText(
                title = R.string.art14_title,
                description = R.string.art14_description,
                art = R.drawable.art14_gojo,
                backgroundImage = R.drawable.art14_bg,
                buttonColor = Color(0xFF125b0d),
                textColor = Color(0xFF125b0d),
                imageContentDescription = R.string.art14_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        16 -> {
            ArtSpaceImageAndText(
                title = R.string.art15_title,
                description = R.string.art15_description,
                art = R.drawable.art15_top,
                backgroundImage = R.drawable.art15_bg,
                buttonColor = Color(0xFFa33749),
                textColor = Color(0xFF3d2d26),
                imageContentDescription = R.string.art15_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        17 -> {
            ArtSpaceImageAndText(
                title = R.string.art16_title,
                description = R.string.art16_description,
                art = R.drawable.art16_spiritedaway,
                backgroundImage = R.drawable.art16_bg,
                buttonColor = Color(0xFF152638),
                textColor = Color(0xFFFFFFFF),
                imageContentDescription = R.string.art16_imageContentDescription,
                onNextClick = { currentStep++  },
                onPreviousClick = { currentStep-- })
        }
        18 -> {
            ArtSpaceImageAndText(
                title = R.string.art17_title,
                description = R.string.art17_description,
                art = R.drawable.art17_nobara,
                backgroundImage = R.drawable.art17_bg,
                buttonColor = Color(0xFF1a1e29),
                textColor = Color(0xFFf5afca),
                imageContentDescription = R.string.art17_imageContentDescription,
                onNextClick = { },
                onPreviousClick = { currentStep-- })
        }
    }
}

@Composable
fun ArtSpaceImageAndText(
    title: Int,
    description: Int,
    art: Int,
    backgroundImage: Int,
    buttonColor: Color,
    textColor: Color,
    imageContentDescription: Int,
    onNextClick: () -> Unit,
    onPreviousClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier)
    {
        Image(
            painter = painterResource(backgroundImage),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .blur(
                radiusX = 10.dp,
                radiusY = 10.dp,
                edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(0.2.dp))),
            contentDescription = null
        )
        Column(
            modifier = Modifier
                .padding(40.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(art),
                contentDescription = stringResource(imageContentDescription),
                modifier = modifier
                    .clip(RoundedCornerShape(24.dp))
            )
            Spacer(modifier = modifier.size(20.dp))
            Text(
                text = stringResource(title),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = textColor
            )
            Spacer(modifier = modifier.size(8.dp))
            Text(
                text = stringResource(description),
                textAlign = TextAlign.Justify,
                color = textColor
            )
            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = modifier
                    .padding(top = 22.dp)
                    .align(Alignment.End)
                    .fillMaxWidth()
                    .size(54.dp)
            ) {
                Button(
                    colors = ButtonDefaults.buttonColors(buttonColor),
                    onClick = onPreviousClick,
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        stringResource(R.string.previous_button),
                        color = Color(0xFFFFFFFF))
                }
                Spacer(modifier = modifier.size(50.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(buttonColor),
                    onClick = onNextClick,
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        stringResource(R.string.next_button),
                        color = Color(0xFFFFFFFF))
                }
            }
        }
    }
}

@Composable
fun ArtSpaceStartPage(
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier)
    {
        val backgroundImage = painterResource(id = R.drawable.start_page_bg)
        Image(
            painter = backgroundImage,
            contentDescription = stringResource(R.string.front_page_bg_content_desc),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            modifier = Modifier
                .padding(40.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val introImage = painterResource(R.drawable.front_page_icon)
            Text(
                text = stringResource(R.string.front_page_heading),
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp,
                color = Color(0xFFFFFFFF),
                modifier = Modifier
            )
            Spacer(modifier = modifier.size(110.dp))
            Image(
                painter = introImage,
                contentDescription = stringResource(R.string.front_page_icon),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .border(
                        BorderStroke(4.dp, Color(0XFF1d1a22)),
                        CircleShape
                    )
                    .padding(4.dp)
                    .clip(CircleShape)
                )
            Text(
                text = stringResource(R.string.front_page_title),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 18.sp,
                color = Color(0xFF000000),
                modifier = Modifier
                    .padding(end = 155.dp)
            )
            Spacer(modifier = modifier.size(150.dp))
            Button(
                onClick = onButtonClick,
                modifier = Modifier,
                colors = ButtonDefaults.buttonColors(Color(0xFFFFFFFF))
                ) {
                Text(
                    text = stringResource(R.string.front_page_button_text),
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF000000),
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppSpacePreview() {
    ArtSpaceTheme {
        ArtSpaceImageAndText(
            title = R.string.art17_title,
            description = R.string.art17_description,
            art = R.drawable.art17_nobara,
            backgroundImage = R.drawable.art17_bg,
            buttonColor = Color(0xFF1a1e29),
            textColor = Color(0xFFf5afca),
            imageContentDescription = R.string.art4_imageContentDescription,
            onNextClick = { },
            onPreviousClick = { })
    }
}