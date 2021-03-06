// pages/about/about.js
//获取应用实例
var app = getApp();
var initData = 'this is first line\nthis is second line';
var extraLine = [];
Page({
  data: {
    text: initData,
    userInfo: {},
    message:"今天是个好日子",
    title:"圆梦科技公司",
    img:"../../little_animal/little_animal_24.png"


  },
    add: function(e) {
    extraLine.push('other line')
    this.setData({
      text: initData + '\n' + extraLine.join('\n')
    })
  },
  remove: function(e) {
    if (extraLine.length > 0) {
      extraLine.pop()
      this.setData({
        text: initData + '\n' + extraLine.join('\n')
      })
    }
  },
  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function () {
    console.log('onLoad')
    var that = this
    //调用应用实例的方法获取全局数据
    app.getUserInfo(function(userInfo){
      //更新数据
      that.setData({
        userInfo:userInfo
      })
    })
  }
})
