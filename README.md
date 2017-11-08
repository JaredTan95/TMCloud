# TMCloud
    TMCloud是Trailer Music Cloud的简称。
 
>  *Trailer music (a subset of production music) is the background music used for film previews, which is not always from the film's soundtrack. The purpose of this music is to complement, support and integrate the sales messaging of the mini-movie that is a film trailer. Because the score for a movie is usually composed after the film is finished (which is much after trailers are released), a trailer will incorporate music from other sources. Sometimes music from other successful films or hit songs is used as a subconscious tie-in method.*
>  ————From [Wikipedia][1]

## 待定内容...
    目前国内关于版权音乐、预告片音乐甚者说科幻史诗预告片配乐的动态较少，我也知道有一些团队正在制作属于中国的科幻史诗预告片配乐，但是我还是想凭借自己的力量能够稍微推动预告片音乐在国内的发展。不为别的原因，只因喜欢。
    如果你对该开源项目感兴趣，你可以扫描下面的二维码和我一起交流 ^_^
    <img src="http://oosk9q3p6.bkt.clouddn.com/wechatTJ.png" style="width:100px;"/>

## 技术选型
| 模块 | 说明 | 技术点 | 
| - | :-: | :-: | 
| tmcloud-discovery-eureka-server(port:8761/8762) | 服务注册与发现。 | Spring cloud eureka | 
| tmcloud-admin-ui(port:10000) | 服务监控界面。 | Spring boot admin | 
| tmcloud-provider-user(port:9901) | 用户服务提供者。 | Spring cloud eureka、Mybatis | 

    

  [1]: https://en.wikipedia.org/wiki/Trailer_music
