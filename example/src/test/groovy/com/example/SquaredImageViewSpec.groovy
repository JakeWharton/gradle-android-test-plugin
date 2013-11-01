package com.example

import android.view.View
import org.robolectric.Robolectric

class SquaredImageViewSpec extends RoboSpecification {

  def "test modulus"() {
    given:
    SquaredImageView view = new SquaredImageView(Robolectric.application)

    int width = View.MeasureSpec.makeMeasureSpec(100, View.MeasureSpec.EXACTLY)
    int height = View.MeasureSpec.makeMeasureSpec(200, View.MeasureSpec.EXACTLY)

    when:
    view.measure(width, height)

    then:
    view.getMeasuredWidth() == 100
    view.getMeasuredHeight() == 100
  }
}
