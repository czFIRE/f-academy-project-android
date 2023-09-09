package app.futured.academyproject.tools.extensions

import android.content.Intent
import android.net.Uri
import app.futured.academyproject.data.model.local.Place


fun Place.createNavigationIntent(): Intent = Intent(
    Intent.ACTION_VIEW,
    Uri.parse("geo:${latitude},${longitude}?q=${name}"),
)

fun Place.makeCallIntent(): Intent = Intent(
    Intent.ACTION_DIAL,
    Uri.parse("tel:${phone}"),
)

fun Place.sendEmailIntent(): Intent = Intent(
    Intent.ACTION_SENDTO,
    Uri.parse("mailto:${email}")
)