package com.hxm.httplib;

import java.util.List;

/**
 * Created by hxm on 2017/7/6.
 * 描述：
 */
public class Book {

    /**
     * count : 1
     * start : 0
     * total : 984
     * books : [{"rating":{"max":10,"numRaters":162,"average":"8.2","min":0},"subtitle":"","author":["范怀宇"],"pubdate":"2012-8","tags":[{"count":365,"name":"Android","title":"Android"},{"count":114,"name":"编程","title":"编程"},{"count":68,"name":"计算机","title":"计算机"},{"count":53,"name":"android","title":"android"},{"count":37,"name":"互联网","title":"互联网"},{"count":28,"name":"范老师","title":"范老师"},{"count":25,"name":"计算机技术","title":"计算机技术"},{"count":21,"name":"大牛之作","title":"大牛之作"}],"origin_title":"","image":"https://img1.doubanio.com/mpic/s11184539.jpg","binding":"","translator":[],"catalog":"前言\n致谢\n第1章　Android的系统架构/1\n1.1　Android系统架构概况/2\n1.1.1　应用层/4\n1.1.2　框架层/5\n1.1.3　运行时/5\n1.1.4　核心类库/7\n1.1.5　硬件抽象层和Linux内核/7\n1.2　Android的核心功能模块/8\n1.2.1　界面框架/8\n1.2.2　数据存储/9\n1.2.3　网络通信/10\n1.2.4　地理信息/11\n1.2.5　图形和多媒体处理/11\n1.2.6　外部设备/12\n1.2.7　特色功能模块/13\n1.3　Android的架构特征和设计思想/13\n1.3.1　平台开放性/14\n1.3.2　基于组件的应用设计/14\n1.3.3　基于网络服务的平台/15\n1.4　小结/15\n第2章　Android源代码的下载和编译/16\n2.1　Android源代码的获取和编译/17\n2.1.1　环境搭建/18\n2.1.2　源代码获取/18\n2.1.3　源代码的编译/21\n2.2　Android源代码结构/22\n2.2.1　框架层源代码目录frameworks/22\n2.2.2　应用层源代码目录packages/24\n2.2.3　其他源代码目录/24\n2.3　Android源代码的阅读和编辑/25\n2.3.1　用Eclipse阅读源代码/25\n2.3.2　反馈Bug/26\n2.3.3　提交修改/27\n2.4　小结/27\n第3章　Android组件模型解析/28\n3.1　基于Mashup的应用设计/29\n3.1.1　Android中的Mashup/29\n3.1.2　基于Mashup的Android应用模型/30\n3.1.3　基于Mashup的应用架构特征/32\n3.2　界面组件Activity解析/34\n3.2.1　界面组件的功能和特征/34\n3.2.2　界面组件的开发/35\n3.2.3　界面组件的数据结构/39\n3.3　服务组件Service解析/40\n3.3.1　服务组件的功能和特征/41\n3.3.2　服务组件的开发和使用/43\n3.3.3　服务组件的进程间通信模型/45\n3.4　触发器组件Broadcast Receiver解析/49\n3.4.1　触发器组件的功能和特征/49\n3.4.2　触发器组件的使用/50\n3.4.3　广播事件的发送/52\n3.5　数据源组件Content Provider解析/52\n3.5.1　数据源组件的定位和操作/53\n3.5.2　数据源组件的开发/55\n3.5.3　数据源组件的实现细节/57\n3.6　应用配置文件解析/59\n3.6.1　权限配置/61\n3.6.2　环境配置/63\n3.6.3　应用和组件配置/65\n3.7　小结/66\n第4章　Android的Intent机制/67\n4.1　Intent对象的作用和构成/68\n4.1.1　Intent对象的作用/69\n4.1.2　Intent对象的构成/70\n4.1.3　Intent对象解析/75\n4.1.4　Intent Filter对象/76\n4.2　意图匹配/78\n4.2.1　意图匹配的算法流程/79\n4.2.2　匹配组件的选择/84\n4.2.3　意图匹配的优化/85\n4.3　意图机制的应用/86\n4.3.1　意图机制在界面组件中的应用/86\n4.3.2　意图机制在服务组件中的应用/88\n4.3.3　意图机制在触发器组件中的应用/89\n4.4　小结/90\n第5章　组件生命周期解析/91\n5.1　应用进程模型/92\n5.1.1　应用、组件和进程/92\n5.1.2　组件的应用进程配置/94\n5.2　应用进程托管/96\n5.2.1　为什么需要进程托管/97\n5.2.2　进程优先级/97\n5.2.3　进程回收算法/100\n5.2.4　进程的强行终止/103\n5.2.5　掌控进程的优先级/105\n5.3　组件的生命周期模型/106\n5.3.1　界面组件的生命周期/107\n5.3.2　服务组件的生命周期/115\n5.3.3　触发器组件的生命周期/119\n5.3.4　数据源组件的生命周期/120\n5.3.5　应用环境的生命周期/120\n5.4　任务和界面组件栈/120\n5.4.1　界面组件的运行模式/122\n5.4.2　组件的任务黏度/126\n5.4.3　实际应用中的任务控制/127\n5.5　小结/128\n第6章　组件间的数据传输/129\n6.1　利用Intent对象进行数据传输/130\n6.1.1　利用Intent对象回传数据/131\n6.1.2　利用Intent对象传递数据的优缺点/133\n6.2　利用文件进行数据共享/134\n6.2.1　利用文件进行数据共享的实现/134\n6.2.2　利用文件进行数据共享的优缺点/135\n6.3　利用应用环境的全局数据共享/136\n6.3.1　利用应用环境对象共享数据的实现/137\n6.3.2　利用应用环境对象共享数据的优缺点/138\n6.4　利用组件共享数据/139\n6.4.1　利用数据源组件共享数据/139\n6.4.2　利用服务组件共享数据/140\n6.5　小结/140\n第7章　Android控件解析/141\n7.1　Android的控件框架/142\n7.1.1　Android控件构成/142\n7.1.2　Android交互事件传输/143\n7.1.3　Android控件属性/145\n7.1.4　控件的丈量和绘制/150\n7.2　Android的窗口机制/150\n7.2.1　窗口机制的基本原理/151\n7.2.2　界面组件和窗口/152\n7.2.3　对话框/154\n7.2.4　弹出窗口/156\n7.3　Android的基本控件介绍/158\n7.3.1　文本控件/159\n7.3.2　图像控件/163\n7.3.3　Surface控件/164\n7.3.4　Layout控件/164\n7.3.5　适配器控件/167\n7.3.6　选项卡控件/172\n7.3.7　浏览器控件/173\n7.4　自定义控件/175\n7.4.1　控件的定制/175\n7.4.2 　复合控件/180\n7.4.3　自绘控件/183\n7.5　Android界面新发展/188\n7.5.1　动作栏/188\n7.5.2　界面片段/191\n7.5.3　重新定制选项卡/197\n7.5.4　交互界面的适配/200\n7.6　小结/204\n第8章　应用资源/205\n8.1　Android应用资源体系/206\n8.1.1　Android的应用资源构成/206\n8.1.2　应用资源的适配/208\n8.1.3　应用资源的动态匹配/209\n8.2　应用资源的调用/213\n8.2.1　应用资源的编译和R类/213\n8.2.2　应用资源的管理/215\n8.2.3　使用应用资源/216\n8.3　应用资源的类型/217\n8.3.1　界面和样式/217\n8.3.2　字符串和常量/221\n8.3.3　图像、图形和动画/223\n8.3.4　其他资源文件/225\n8.4　小结/225\n第9章　数据存储/226\n9.1　Android的文件系统/227\n9.1.1　Android的目录结构/229\n9.1.2　Android的应用数据存储/229\n9.1.3　Android的文件操作/231\n9.2　使用设置文件/233\n9.2.1　设置文件的存储和使用/234\n9.2.2　设置界面组件/235\n9.3　使用数据库/238\n9.3.1　Android数据库实现/238\n9.3.2　Android数据库的使用/240\n9.4　存储在云端/243\n9.4.1　云端存储的架构/244\n9.4.2　云端存储的使用/245\n9.5　小结/247\n第10章　网络通信/248\n10.1　Web通信/249\n10.1.1　基于HTTP的网络连接/249\n10.1.2　联网方式的选择/252\n10.1.3　WiFi的管理/254\n10.2　蓝牙/256\n10.2.1　Android的蓝牙实现/256\n10.2.2　基于蓝牙的通信/257\n10.3　近场通信/259\n10.3.1　基于NFC的识别和通信/259\n10.3.2　基于NFC的点对点通信/263\n10.4　基于WiFi连接的P2P通信/263\n10.4.1　Android 4.0的P2P连接实现/264\n10.4.2　使用Socket进行数据传输/266\n10.5　小结/268\n第11章　地理信息服务/269\n11.1　Android的定位服务/270\n11.1.1　定位服务框架/270\n11.1.2　位置信息源/272\n11.1.3　定位选择/273\n11.1.4　定位实例/274\n11.2　Android的地址服务/277\n11.2.1　地址服务的框架/277\n11.2.2　使用地址服务/278\n11.3　Android的地图服务/279\n11.3.1　使用地图/279\n11.3.2　其他使用地图服务的方式/282\n11.4　小结/283\n第12章　多媒体处理/284\n12.1　Android的图像处理/285\n12.1.1　图像的表示/285\n12.1.2　图像的读取和输出/286\n12.1.3　图像的呈现/288\n12.1.4　图像的管理/290\n12.2　Android的音视频处理/291\n12.2.1　Android音视频的支持框架/291\n12.2.2　Android音视频的播放/292\n12.2.3　Android音视频的录制/294\n12.3　Android中相机的使用/296\n12.4　小结/300\n第13章　其他重要模块/301\n13.1　通话和短信/302\n13.1.1　Android的通话和短信框架/302\n13.1.2　通话的处理/303\n13.1.3　短信的发送和接收/305\n13.2　App Widget的使用和实现/308\n13.2.1　Android的App Widget框架/309\n13.2.2　App Widget的界面构造和Remote Views /311\n13.2.3　App Widget的事件处理和Pending Intent /313\n13.3　Android的应用内搜索/317\n13.3.1　Android应用内搜索实现框架/317\n13.3.2　为应用定制搜索功能/318\n13.3.3　全局搜索功能/322\n13.4　Android的全局通知机制/323\n13.4.1　全局通知的类型和实现/324\n13.4.2　Toast的使用/325\n13.4.3　状态栏通知/327\n13.5　Android联系人处理/331\n13.5.1　Android联系人数据存储框架/331\n13.5.2　Android联系人操作/332\n13.6　小结/334","ebook_url":"https://read.douban.com/ebook/15171473/","pages":"356","images":{"small":"https://img1.doubanio.com/spic/s11184539.jpg","large":"https://img1.doubanio.com/lpic/s11184539.jpg","medium":"https://img1.doubanio.com/mpic/s11184539.jpg"},"alt":"https://book.douban.com/subject/11530748/","id":"11530748","publisher":"机械工业出版社","isbn10":"711139058X","isbn13":"9787111390589","title":"Android开发精要","url":"https://api.douban.com/v2/book/11530748","alt_title":"","author_intro":"范怀宇，资深Android开发工程师，毕业于清华大学，从事移动开发多年，对Android系统有颇为深入的研究，开发经验十分丰富。曾就职于网易有道，负责完成了有道词典Android版、网易掌上邮Android版、网易八方Android版等项目的开发工作，现就职于豌豆实验室 ，负责豌豆荚2.0版本的设计和开发。\n作者微博：@duguguiyu（http://weibo.com/duguguiyu）\n个人站点：http://flyvenus.net","summary":"《Android开发精要》如何才能写出贴近Android设计理念、能够更加高效和可靠运行的Android应用？通过Android的源代码去了解其底层实现细节是最重要的方法之一！然而，Android系统太过于庞大，源代码实现复杂，学习的技术门槛和时间成本都很高。有没有一种方法既能帮助开发者深入理解Android应用开发，又能不被底层大量的实现细节所羁绊，迅速掌握编写高质量Android应用所需的知识？《Android开发精要》针对这个问题给出了完美的答案！它从Android繁杂的源代码中抽取出了Android开发的\u201c精华\u201d和\u201c要点\u201d，剥离了大量琐碎的底层实现细节，进行了高度概括和总结，不仅能帮助开发者迅速从宏观上理解整个Android系统的设计理念，而且能帮助开发者迅速从微观上掌握核心知识点的原理，从而编写出高质量的Android应用。\n《Android开发精要》共13章，在逻辑上分为4个部分。第一部分（1-2章）：第1章系统介绍了Android的系统架构、核心模块和设计思想，旨在让读者真正理解它的设计理念；第2章讲解了Android源代码的获取、编译、阅读和编辑的方法。第二部分（3-6章）：第3章深入阐述了Android组件机制的设计理念和重要特征，并详细介绍了4大组件的方法和原理；第4章讲解了Intent对象和Android的意图机制，阐明了Android是如何将来自不同应用、不同进程的组件整合在一起的；第5章解析了Android中各个组件的生命周期，包括组件的进程模型和线程模型；第6章从开发的角度详细阐述了组件间数据传递的解决方案，以及它们的优缺点和适用场景。第三部分（7-8章）：第7章深入讲解了Android的控件框架，结合实际项目对重要控件的实现和使用逐一进行了分析，还包含Android 4.0界面开发的实践\u201c精华\u201d；第8章分析了Android的资源体系，剖析了Android底层对资源的处理。第4部分（9-13章）：第9章讲解了Android的数据存储结构，以及不同数据存储模式的使用要点；第10章分析了Android的各种网络连接方式，涵盖NFC和基于Wifi的P2P连接等内容；第11章讲解了Android的定位服务、地址解析服务、地图服务的框架实现；第12章仔细分析了Android各种多媒体功能的实现机制；第13章对Android中比较有特色的一些模块的实现细节进行了分析。\n海报：","ebook_price":"25.00","price":"69.00元"}]
     */

    private int count;
    private int start;
    private int total;
    private List<BooksBean> books;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BooksBean> getBooks() {
        return books;
    }

    public void setBooks(List<BooksBean> books) {
        this.books = books;
    }

    public static class BooksBean {
        /**
         * rating : {"max":10,"numRaters":162,"average":"8.2","min":0}
         * subtitle :
         * author : ["范怀宇"]
         * pubdate : 2012-8
         * tags : [{"count":365,"name":"Android","title":"Android"},{"count":114,"name":"编程","title":"编程"},{"count":68,"name":"计算机","title":"计算机"},{"count":53,"name":"android","title":"android"},{"count":37,"name":"互联网","title":"互联网"},{"count":28,"name":"范老师","title":"范老师"},{"count":25,"name":"计算机技术","title":"计算机技术"},{"count":21,"name":"大牛之作","title":"大牛之作"}]
         * origin_title :
         * image : https://img1.doubanio.com/mpic/s11184539.jpg
         * binding :
         * translator : []
         * catalog : 前言
         * 致谢
         * 第1章　Android的系统架构/1
         * 1.1　Android系统架构概况/2
         * 1.1.1　应用层/4
         * 1.1.2　框架层/5
         * 1.1.3　运行时/5
         * 1.1.4　核心类库/7
         * 1.1.5　硬件抽象层和Linux内核/7
         * 1.2　Android的核心功能模块/8
         * 1.2.1　界面框架/8
         * 1.2.2　数据存储/9
         * 1.2.3　网络通信/10
         * 1.2.4　地理信息/11
         * 1.2.5　图形和多媒体处理/11
         * 1.2.6　外部设备/12
         * 1.2.7　特色功能模块/13
         * 1.3　Android的架构特征和设计思想/13
         * 1.3.1　平台开放性/14
         * 1.3.2　基于组件的应用设计/14
         * 1.3.3　基于网络服务的平台/15
         * 1.4　小结/15
         * 第2章　Android源代码的下载和编译/16
         * 2.1　Android源代码的获取和编译/17
         * 2.1.1　环境搭建/18
         * 2.1.2　源代码获取/18
         * 2.1.3　源代码的编译/21
         * 2.2　Android源代码结构/22
         * 2.2.1　框架层源代码目录frameworks/22
         * 2.2.2　应用层源代码目录packages/24
         * 2.2.3　其他源代码目录/24
         * 2.3　Android源代码的阅读和编辑/25
         * 2.3.1　用Eclipse阅读源代码/25
         * 2.3.2　反馈Bug/26
         * 2.3.3　提交修改/27
         * 2.4　小结/27
         * 第3章　Android组件模型解析/28
         * 3.1　基于Mashup的应用设计/29
         * 3.1.1　Android中的Mashup/29
         * 3.1.2　基于Mashup的Android应用模型/30
         * 3.1.3　基于Mashup的应用架构特征/32
         * 3.2　界面组件Activity解析/34
         * 3.2.1　界面组件的功能和特征/34
         * 3.2.2　界面组件的开发/35
         * 3.2.3　界面组件的数据结构/39
         * 3.3　服务组件Service解析/40
         * 3.3.1　服务组件的功能和特征/41
         * 3.3.2　服务组件的开发和使用/43
         * 3.3.3　服务组件的进程间通信模型/45
         * 3.4　触发器组件Broadcast Receiver解析/49
         * 3.4.1　触发器组件的功能和特征/49
         * 3.4.2　触发器组件的使用/50
         * 3.4.3　广播事件的发送/52
         * 3.5　数据源组件Content Provider解析/52
         * 3.5.1　数据源组件的定位和操作/53
         * 3.5.2　数据源组件的开发/55
         * 3.5.3　数据源组件的实现细节/57
         * 3.6　应用配置文件解析/59
         * 3.6.1　权限配置/61
         * 3.6.2　环境配置/63
         * 3.6.3　应用和组件配置/65
         * 3.7　小结/66
         * 第4章　Android的Intent机制/67
         * 4.1　Intent对象的作用和构成/68
         * 4.1.1　Intent对象的作用/69
         * 4.1.2　Intent对象的构成/70
         * 4.1.3　Intent对象解析/75
         * 4.1.4　Intent Filter对象/76
         * 4.2　意图匹配/78
         * 4.2.1　意图匹配的算法流程/79
         * 4.2.2　匹配组件的选择/84
         * 4.2.3　意图匹配的优化/85
         * 4.3　意图机制的应用/86
         * 4.3.1　意图机制在界面组件中的应用/86
         * 4.3.2　意图机制在服务组件中的应用/88
         * 4.3.3　意图机制在触发器组件中的应用/89
         * 4.4　小结/90
         * 第5章　组件生命周期解析/91
         * 5.1　应用进程模型/92
         * 5.1.1　应用、组件和进程/92
         * 5.1.2　组件的应用进程配置/94
         * 5.2　应用进程托管/96
         * 5.2.1　为什么需要进程托管/97
         * 5.2.2　进程优先级/97
         * 5.2.3　进程回收算法/100
         * 5.2.4　进程的强行终止/103
         * 5.2.5　掌控进程的优先级/105
         * 5.3　组件的生命周期模型/106
         * 5.3.1　界面组件的生命周期/107
         * 5.3.2　服务组件的生命周期/115
         * 5.3.3　触发器组件的生命周期/119
         * 5.3.4　数据源组件的生命周期/120
         * 5.3.5　应用环境的生命周期/120
         * 5.4　任务和界面组件栈/120
         * 5.4.1　界面组件的运行模式/122
         * 5.4.2　组件的任务黏度/126
         * 5.4.3　实际应用中的任务控制/127
         * 5.5　小结/128
         * 第6章　组件间的数据传输/129
         * 6.1　利用Intent对象进行数据传输/130
         * 6.1.1　利用Intent对象回传数据/131
         * 6.1.2　利用Intent对象传递数据的优缺点/133
         * 6.2　利用文件进行数据共享/134
         * 6.2.1　利用文件进行数据共享的实现/134
         * 6.2.2　利用文件进行数据共享的优缺点/135
         * 6.3　利用应用环境的全局数据共享/136
         * 6.3.1　利用应用环境对象共享数据的实现/137
         * 6.3.2　利用应用环境对象共享数据的优缺点/138
         * 6.4　利用组件共享数据/139
         * 6.4.1　利用数据源组件共享数据/139
         * 6.4.2　利用服务组件共享数据/140
         * 6.5　小结/140
         * 第7章　Android控件解析/141
         * 7.1　Android的控件框架/142
         * 7.1.1　Android控件构成/142
         * 7.1.2　Android交互事件传输/143
         * 7.1.3　Android控件属性/145
         * 7.1.4　控件的丈量和绘制/150
         * 7.2　Android的窗口机制/150
         * 7.2.1　窗口机制的基本原理/151
         * 7.2.2　界面组件和窗口/152
         * 7.2.3　对话框/154
         * 7.2.4　弹出窗口/156
         * 7.3　Android的基本控件介绍/158
         * 7.3.1　文本控件/159
         * 7.3.2　图像控件/163
         * 7.3.3　Surface控件/164
         * 7.3.4　Layout控件/164
         * 7.3.5　适配器控件/167
         * 7.3.6　选项卡控件/172
         * 7.3.7　浏览器控件/173
         * 7.4　自定义控件/175
         * 7.4.1　控件的定制/175
         * 7.4.2 　复合控件/180
         * 7.4.3　自绘控件/183
         * 7.5　Android界面新发展/188
         * 7.5.1　动作栏/188
         * 7.5.2　界面片段/191
         * 7.5.3　重新定制选项卡/197
         * 7.5.4　交互界面的适配/200
         * 7.6　小结/204
         * 第8章　应用资源/205
         * 8.1　Android应用资源体系/206
         * 8.1.1　Android的应用资源构成/206
         * 8.1.2　应用资源的适配/208
         * 8.1.3　应用资源的动态匹配/209
         * 8.2　应用资源的调用/213
         * 8.2.1　应用资源的编译和R类/213
         * 8.2.2　应用资源的管理/215
         * 8.2.3　使用应用资源/216
         * 8.3　应用资源的类型/217
         * 8.3.1　界面和样式/217
         * 8.3.2　字符串和常量/221
         * 8.3.3　图像、图形和动画/223
         * 8.3.4　其他资源文件/225
         * 8.4　小结/225
         * 第9章　数据存储/226
         * 9.1　Android的文件系统/227
         * 9.1.1　Android的目录结构/229
         * 9.1.2　Android的应用数据存储/229
         * 9.1.3　Android的文件操作/231
         * 9.2　使用设置文件/233
         * 9.2.1　设置文件的存储和使用/234
         * 9.2.2　设置界面组件/235
         * 9.3　使用数据库/238
         * 9.3.1　Android数据库实现/238
         * 9.3.2　Android数据库的使用/240
         * 9.4　存储在云端/243
         * 9.4.1　云端存储的架构/244
         * 9.4.2　云端存储的使用/245
         * 9.5　小结/247
         * 第10章　网络通信/248
         * 10.1　Web通信/249
         * 10.1.1　基于HTTP的网络连接/249
         * 10.1.2　联网方式的选择/252
         * 10.1.3　WiFi的管理/254
         * 10.2　蓝牙/256
         * 10.2.1　Android的蓝牙实现/256
         * 10.2.2　基于蓝牙的通信/257
         * 10.3　近场通信/259
         * 10.3.1　基于NFC的识别和通信/259
         * 10.3.2　基于NFC的点对点通信/263
         * 10.4　基于WiFi连接的P2P通信/263
         * 10.4.1　Android 4.0的P2P连接实现/264
         * 10.4.2　使用Socket进行数据传输/266
         * 10.5　小结/268
         * 第11章　地理信息服务/269
         * 11.1　Android的定位服务/270
         * 11.1.1　定位服务框架/270
         * 11.1.2　位置信息源/272
         * 11.1.3　定位选择/273
         * 11.1.4　定位实例/274
         * 11.2　Android的地址服务/277
         * 11.2.1　地址服务的框架/277
         * 11.2.2　使用地址服务/278
         * 11.3　Android的地图服务/279
         * 11.3.1　使用地图/279
         * 11.3.2　其他使用地图服务的方式/282
         * 11.4　小结/283
         * 第12章　多媒体处理/284
         * 12.1　Android的图像处理/285
         * 12.1.1　图像的表示/285
         * 12.1.2　图像的读取和输出/286
         * 12.1.3　图像的呈现/288
         * 12.1.4　图像的管理/290
         * 12.2　Android的音视频处理/291
         * 12.2.1　Android音视频的支持框架/291
         * 12.2.2　Android音视频的播放/292
         * 12.2.3　Android音视频的录制/294
         * 12.3　Android中相机的使用/296
         * 12.4　小结/300
         * 第13章　其他重要模块/301
         * 13.1　通话和短信/302
         * 13.1.1　Android的通话和短信框架/302
         * 13.1.2　通话的处理/303
         * 13.1.3　短信的发送和接收/305
         * 13.2　App Widget的使用和实现/308
         * 13.2.1　Android的App Widget框架/309
         * 13.2.2　App Widget的界面构造和Remote Views /311
         * 13.2.3　App Widget的事件处理和Pending Intent /313
         * 13.3　Android的应用内搜索/317
         * 13.3.1　Android应用内搜索实现框架/317
         * 13.3.2　为应用定制搜索功能/318
         * 13.3.3　全局搜索功能/322
         * 13.4　Android的全局通知机制/323
         * 13.4.1　全局通知的类型和实现/324
         * 13.4.2　Toast的使用/325
         * 13.4.3　状态栏通知/327
         * 13.5　Android联系人处理/331
         * 13.5.1　Android联系人数据存储框架/331
         * 13.5.2　Android联系人操作/332
         * 13.6　小结/334
         * ebook_url : https://read.douban.com/ebook/15171473/
         * pages : 356
         * images : {"small":"https://img1.doubanio.com/spic/s11184539.jpg","large":"https://img1.doubanio.com/lpic/s11184539.jpg","medium":"https://img1.doubanio.com/mpic/s11184539.jpg"}
         * alt : https://book.douban.com/subject/11530748/
         * id : 11530748
         * publisher : 机械工业出版社
         * isbn10 : 711139058X
         * isbn13 : 9787111390589
         * title : Android开发精要
         * url : https://api.douban.com/v2/book/11530748
         * alt_title :
         * author_intro : 范怀宇，资深Android开发工程师，毕业于清华大学，从事移动开发多年，对Android系统有颇为深入的研究，开发经验十分丰富。曾就职于网易有道，负责完成了有道词典Android版、网易掌上邮Android版、网易八方Android版等项目的开发工作，现就职于豌豆实验室 ，负责豌豆荚2.0版本的设计和开发。
         * 作者微博：@duguguiyu（http://weibo.com/duguguiyu）
         * 个人站点：http://flyvenus.net
         * summary : 《Android开发精要》如何才能写出贴近Android设计理念、能够更加高效和可靠运行的Android应用？通过Android的源代码去了解其底层实现细节是最重要的方法之一！然而，Android系统太过于庞大，源代码实现复杂，学习的技术门槛和时间成本都很高。有没有一种方法既能帮助开发者深入理解Android应用开发，又能不被底层大量的实现细节所羁绊，迅速掌握编写高质量Android应用所需的知识？《Android开发精要》针对这个问题给出了完美的答案！它从Android繁杂的源代码中抽取出了Android开发的“精华”和“要点”，剥离了大量琐碎的底层实现细节，进行了高度概括和总结，不仅能帮助开发者迅速从宏观上理解整个Android系统的设计理念，而且能帮助开发者迅速从微观上掌握核心知识点的原理，从而编写出高质量的Android应用。
         * 《Android开发精要》共13章，在逻辑上分为4个部分。第一部分（1-2章）：第1章系统介绍了Android的系统架构、核心模块和设计思想，旨在让读者真正理解它的设计理念；第2章讲解了Android源代码的获取、编译、阅读和编辑的方法。第二部分（3-6章）：第3章深入阐述了Android组件机制的设计理念和重要特征，并详细介绍了4大组件的方法和原理；第4章讲解了Intent对象和Android的意图机制，阐明了Android是如何将来自不同应用、不同进程的组件整合在一起的；第5章解析了Android中各个组件的生命周期，包括组件的进程模型和线程模型；第6章从开发的角度详细阐述了组件间数据传递的解决方案，以及它们的优缺点和适用场景。第三部分（7-8章）：第7章深入讲解了Android的控件框架，结合实际项目对重要控件的实现和使用逐一进行了分析，还包含Android 4.0界面开发的实践“精华”；第8章分析了Android的资源体系，剖析了Android底层对资源的处理。第4部分（9-13章）：第9章讲解了Android的数据存储结构，以及不同数据存储模式的使用要点；第10章分析了Android的各种网络连接方式，涵盖NFC和基于Wifi的P2P连接等内容；第11章讲解了Android的定位服务、地址解析服务、地图服务的框架实现；第12章仔细分析了Android各种多媒体功能的实现机制；第13章对Android中比较有特色的一些模块的实现细节进行了分析。
         * 海报：
         * ebook_price : 25.00
         * price : 69.00元
         */

        private RatingBean rating;
        private String subtitle;
        private String pubdate;
        private String origin_title;
        private String image;
        private String binding;
        private String catalog;
        private String ebook_url;
        private String pages;
        private ImagesBean images;
        private String alt;
        private String id;
        private String publisher;
        private String isbn10;
        private String isbn13;
        private String title;
        private String url;
        private String alt_title;
        private String author_intro;
        private String summary;
        private String ebook_price;
        private String price;
        private List<String> author;
        private List<TagsBean> tags;
        private List<?> translator;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getOrigin_title() {
            return origin_title;
        }

        public void setOrigin_title(String origin_title) {
            this.origin_title = origin_title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getBinding() {
            return binding;
        }

        public void setBinding(String binding) {
            this.binding = binding;
        }

        public String getCatalog() {
            return catalog;
        }

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public String getEbook_url() {
            return ebook_url;
        }

        public void setEbook_url(String ebook_url) {
            this.ebook_url = ebook_url;
        }

        public String getPages() {
            return pages;
        }

        public void setPages(String pages) {
            this.pages = pages;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getIsbn10() {
            return isbn10;
        }

        public void setIsbn10(String isbn10) {
            this.isbn10 = isbn10;
        }

        public String getIsbn13() {
            return isbn13;
        }

        public void setIsbn13(String isbn13) {
            this.isbn13 = isbn13;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAlt_title() {
            return alt_title;
        }

        public void setAlt_title(String alt_title) {
            this.alt_title = alt_title;
        }

        public String getAuthor_intro() {
            return author_intro;
        }

        public void setAuthor_intro(String author_intro) {
            this.author_intro = author_intro;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getEbook_price() {
            return ebook_price;
        }

        public void setEbook_price(String ebook_price) {
            this.ebook_price = ebook_price;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public List<String> getAuthor() {
            return author;
        }

        public void setAuthor(List<String> author) {
            this.author = author;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<?> getTranslator() {
            return translator;
        }

        public void setTranslator(List<?> translator) {
            this.translator = translator;
        }

        public static class RatingBean {
            /**
             * max : 10
             * numRaters : 162
             * average : 8.2
             * min : 0
             */

            private int max;
            private int numRaters;
            private String average;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getNumRaters() {
                return numRaters;
            }

            public void setNumRaters(int numRaters) {
                this.numRaters = numRaters;
            }

            public String getAverage() {
                return average;
            }

            public void setAverage(String average) {
                this.average = average;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img1.doubanio.com/spic/s11184539.jpg
             * large : https://img1.doubanio.com/lpic/s11184539.jpg
             * medium : https://img1.doubanio.com/mpic/s11184539.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class TagsBean {
            /**
             * count : 365
             * name : Android
             * title : Android
             */

            private int count;
            private String name;
            private String title;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
