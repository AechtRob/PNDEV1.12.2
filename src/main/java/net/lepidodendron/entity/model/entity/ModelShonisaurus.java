package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelShonisaurus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer tailbase1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer undertail1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer sidebody2;
    private final AdvancedModelRenderer sidebody7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer undertail2;
    private final AdvancedModelRenderer body2b;
    private final AdvancedModelRenderer sidebody2b;
    private final AdvancedModelRenderer sidebody8;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body3i;
    private final AdvancedModelRenderer sidetail3;
    private final AdvancedModelRenderer sidetail2;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer fluke1;
    private final AdvancedModelRenderer fluke2;
    private final AdvancedModelRenderer belly3;
    private final AdvancedModelRenderer rearflipper1;
    private final AdvancedModelRenderer rearflipperfingers1;
    private final AdvancedModelRenderer rearflipper2;
    private final AdvancedModelRenderer rearflipperfingers2;
    private final AdvancedModelRenderer lowerbody3;
    private final AdvancedModelRenderer lowerbody2;
    private final AdvancedModelRenderer lowerbody1;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer belly1;
    private final AdvancedModelRenderer belly1_r1;
    private final AdvancedModelRenderer sidebelly2;
    private final AdvancedModelRenderer sidebelly3;
    private final AdvancedModelRenderer upperneck1;
    private final AdvancedModelRenderer sideneck1;
    private final AdvancedModelRenderer sideneck2;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head1;
    private final AdvancedModelRenderer rostrum1;
    private final AdvancedModelRenderer rostrum2;
    private final AdvancedModelRenderer teeth2;
    private final AdvancedModelRenderer beak1;
    private final AdvancedModelRenderer teeth1;
    private final AdvancedModelRenderer jaw1;
    private final AdvancedModelRenderer lowerrostrum1;
    private final AdvancedModelRenderer lowerrostrum2;
    private final AdvancedModelRenderer teeth4;
    private final AdvancedModelRenderer lowerbeak2;
    private final AdvancedModelRenderer beak3;
    private final AdvancedModelRenderer teeth3;
    private final AdvancedModelRenderer gums1;
    private final AdvancedModelRenderer dewlap1;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer flipper1;
    private final AdvancedModelRenderer flipperfingers1;
    private final AdvancedModelRenderer flipper2;
    private final AdvancedModelRenderer flipperfingers2;
    private final AdvancedModelRenderer body3h;
    private final AdvancedModelRenderer underbelly2;
    private final AdvancedModelRenderer sidebody1;
    private final AdvancedModelRenderer sidebody4;
    private final AdvancedModelRenderer body2y;
    private final AdvancedModelRenderer sidebody2l;
    private final AdvancedModelRenderer sidebody5;
    private final AdvancedModelRenderer sadfin1;
    private final AdvancedModelRenderer sadfin2;
    private final AdvancedModelRenderer underbelly3;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer sidebody3bb;
    private final AdvancedModelRenderer sidebody6;
    private final AdvancedModelRenderer body2a;
    private final AdvancedModelRenderer sidebody2xx;
    private final AdvancedModelRenderer sidebody9;

    private ModelAnimator animator;

    public ModelShonisaurus() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.tailbase1 = new AdvancedModelRenderer(this);
        this.tailbase1.setRotationPoint(0.0F, -0.3F, 12.0F);
        this.root.addChild(tailbase1);
        this.setRotateAngle(tailbase1, -0.0456F, 0.0F, 0.0F);
        this.tailbase1.cubeList.add(new ModelBox(tailbase1, 100, 0, -7.5F, -3.225F, 0.0F, 15, 7, 26, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.9F, 25.0F);
        this.tailbase1.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 78, 0, -5.0F, -3.0F, -3.0F, 10, 6, 13, 0.0F, false));

        this.undertail1 = new AdvancedModelRenderer(this);
        this.undertail1.setRotationPoint(0.0F, 4.8F, 0.9F);
        this.tail1.addChild(undertail1);
        this.setRotateAngle(undertail1, 0.2295F, 0.0F, 0.0F);
        this.undertail1.cubeList.add(new ModelBox(undertail1, 170, 118, -4.0F, -2.0F, 0.0F, 8, 4, 10, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.2F, -2.6F);
        this.tail1.addChild(body2);
        this.setRotateAngle(body2, -0.0456F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 189, 162, -2.5F, -8.0F, 0.0F, 5, 8, 12, 0.0F, false));

        this.sidebody2 = new AdvancedModelRenderer(this);
        this.sidebody2.setRotationPoint(-4.9F, -3.7F, -0.9F);
        this.body2.addChild(sidebody2);
        this.setRotateAngle(sidebody2, 0.0F, 0.0F, 0.5463F);
        this.sidebody2.cubeList.add(new ModelBox(sidebody2, 79, 195, 0.0F, -5.0F, 0.0F, 3, 5, 13, 0.0F, false));

        this.sidebody7 = new AdvancedModelRenderer(this);
        this.sidebody7.setRotationPoint(4.9F, -3.7F, -0.9F);
        this.body2.addChild(sidebody7);
        this.setRotateAngle(sidebody7, 0.0F, 0.0F, -0.5463F);
        this.sidebody7.cubeList.add(new ModelBox(sidebody7, 79, 195, -3.0F, -5.0F, 0.0F, 3, 5, 13, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9F, 9.4F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 194, -4.0F, -3.0F, 0.0F, 8, 5, 10, 0.0F, false));

        this.undertail2 = new AdvancedModelRenderer(this);
        this.undertail2.setRotationPoint(0.0F, 1.4F, 1.0F);
        this.tail2.addChild(undertail2);
        this.setRotateAngle(undertail2, 0.1859F, 0.0F, 0.0F);
        this.undertail2.cubeList.add(new ModelBox(undertail2, 120, 91, -3.0F, 0.0F, 0.0F, 6, 2, 8, 0.0F, false));

        this.body2b = new AdvancedModelRenderer(this);
        this.body2b.setRotationPoint(0.0F, 0.2F, 0.4F);
        this.tail2.addChild(body2b);
        this.setRotateAngle(body2b, -0.0456F, 0.0F, 0.0F);
        this.body2b.cubeList.add(new ModelBox(body2b, 195, 122, -1.5F, -8.0F, -2.0F, 3, 8, 11, 0.0F, false));

        this.sidebody2b = new AdvancedModelRenderer(this);
        this.sidebody2b.setRotationPoint(-4.1F, -3.5F, -0.9F);
        this.body2b.addChild(sidebody2b);
        this.setRotateAngle(sidebody2b, 0.0F, 0.0F, 0.5463F);
        this.sidebody2b.cubeList.add(new ModelBox(sidebody2b, 197, 15, 0.0F, -5.0F, 0.0F, 3, 5, 10, 0.0F, false));

        this.sidebody8 = new AdvancedModelRenderer(this);
        this.sidebody8.setRotationPoint(4.1F, -3.5F, -0.9F);
        this.body2b.addChild(sidebody8);
        this.setRotateAngle(sidebody8, 0.0F, 0.0F, -0.5463F);
        this.sidebody8.cubeList.add(new ModelBox(sidebody8, 197, 15, -3.0F, -5.0F, 0.0F, 3, 5, 10, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.4F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0456F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 104, 165, -3.0F, -3.0F, 0.0F, 6, 4, 7, 0.0F, false));

        this.body3i = new AdvancedModelRenderer(this);
        this.body3i.setRotationPoint(0.0F, -3.7F, 0.4F);
        this.tail3.addChild(body3i);
        this.setRotateAngle(body3i, -0.0456F, 0.0F, 0.0F);
        this.body3i.cubeList.add(new ModelBox(body3i, 0, 0, -1.5F, -3.0F, -1.0F, 3, 4, 7, 0.0F, false));

        this.sidetail3 = new AdvancedModelRenderer(this);
        this.sidetail3.setRotationPoint(-3.1F, 0.8F, -0.9F);
        this.body3i.addChild(sidetail3);
        this.setRotateAngle(sidetail3, 0.0F, 0.0F, 0.4079F);
        this.sidetail3.cubeList.add(new ModelBox(sidetail3, 0, 101, 0.0F, -4.1F, 0.0F, 2, 4, 7, 0.0F, false));

        this.sidetail2 = new AdvancedModelRenderer(this);
        this.sidetail2.setRotationPoint(3.1F, 0.8F, -0.9F);
        this.body3i.addChild(sidetail2);
        this.setRotateAngle(sidetail2, 0.0F, 0.0F, -0.4079F);
        this.sidetail2.cubeList.add(new ModelBox(sidetail2, 0, 101, -2.0F, -4.1F, 0.0F, 2, 4, 7, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -3.5F, 6.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0911F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 198, 35, -1.5F, -3.0F, 0.0F, 3, 6, 9, -0.01F, false));

        this.fluke1 = new AdvancedModelRenderer(this);
        this.fluke1.setRotationPoint(0.0F, -0.9F, 7.6F);
        this.tail4.addChild(fluke1);
        this.setRotateAngle(fluke1, -0.459F, 0.0F, 0.0F);
        this.fluke1.cubeList.add(new ModelBox(fluke1, 164, 162, -1.0F, -4.5F, 0.0F, 2, 7, 21, 0.0F, false));

        this.fluke2 = new AdvancedModelRenderer(this);
        this.fluke2.setRotationPoint(0.0F, 4.2F, -2.0F);
        this.fluke1.addChild(fluke2);
        this.fluke2.cubeList.add(new ModelBox(fluke2, 0, 0, 0.0F, -22.2F, -1.0F, 0, 20, 44, 0.0F, false));

        this.belly3 = new AdvancedModelRenderer(this);
        this.belly3.setRotationPoint(0.0F, 11.4F, 0.0F);
        this.tailbase1.addChild(belly3);
        this.setRotateAngle(belly3, 0.406F, 0.0F, 0.0F);
        this.belly3.cubeList.add(new ModelBox(belly3, 65, 74, -7.0F, -3.0F, 0.0F, 14, 8, 27, 0.0F, false));
        this.belly3.cubeList.add(new ModelBox(belly3, 156, 0, -7.0F, -6.0F, 0.5F, 14, 3, 12, 0.0F, false));

        this.rearflipper1 = new AdvancedModelRenderer(this);
        this.rearflipper1.setRotationPoint(-6.7F, 6.3F, 19.5F);
        this.tailbase1.addChild(rearflipper1);
        this.setRotateAngle(rearflipper1, 0.6374F, -0.1396F, 0.0698F);
        this.rearflipper1.cubeList.add(new ModelBox(rearflipper1, 70, 69, -1.0F, 0.0F, -4.0F, 2, 9, 8, 0.0F, false));

        this.rearflipperfingers1 = new AdvancedModelRenderer(this);
        this.rearflipperfingers1.setRotationPoint(0.0F, 0.0F, -5.1F);
        this.rearflipper1.addChild(rearflipperfingers1);
        this.rearflipperfingers1.cubeList.add(new ModelBox(rearflipperfingers1, 127, 120, 0.0F, 0.0F, 0.0F, 0, 25, 13, 0.0F, false));

        this.rearflipper2 = new AdvancedModelRenderer(this);
        this.rearflipper2.setRotationPoint(6.7F, 6.3F, 19.5F);
        this.tailbase1.addChild(rearflipper2);
        this.setRotateAngle(rearflipper2, 0.6374F, 0.1396F, -0.0698F);
        this.rearflipper2.cubeList.add(new ModelBox(rearflipper2, 70, 69, -1.0F, 0.0F, -4.0F, 2, 9, 8, 0.0F, true));

        this.rearflipperfingers2 = new AdvancedModelRenderer(this);
        this.rearflipperfingers2.setRotationPoint(0.0F, 0.0F, -5.1F);
        this.rearflipper2.addChild(rearflipperfingers2);
        this.rearflipperfingers2.cubeList.add(new ModelBox(rearflipperfingers2, 127, 120, 0.0F, 0.0F, 0.0F, 0, 25, 13, 0.0F, true));

        this.lowerbody3 = new AdvancedModelRenderer(this);
        this.lowerbody3.setRotationPoint(0.0F, 0.4F, 2.4F);
        this.tailbase1.addChild(lowerbody3);
        this.setRotateAngle(lowerbody3, 0.0456F, 0.0F, 0.0F);
        this.lowerbody3.cubeList.add(new ModelBox(lowerbody3, 0, 101, -11.0F, -1.0F, -18.0F, 22, 15, 18, 0.0F, false));

        this.lowerbody2 = new AdvancedModelRenderer(this);
        this.lowerbody2.setRotationPoint(0.0F, -0.2F, -14.8F);
        this.lowerbody3.addChild(lowerbody2);
        this.setRotateAngle(lowerbody2, 0.0456F, 0.0F, 0.0F);
        this.lowerbody2.cubeList.add(new ModelBox(lowerbody2, 0, 0, -14.0F, -0.75F, -22.0F, 28, 17, 22, 0.01F, false));
        this.lowerbody2.cubeList.add(new ModelBox(lowerbody2, 70, 42, -12.0F, 16.5F, -22.0F, 24, 5, 22, 0.0F, false));
        this.lowerbody2.cubeList.add(new ModelBox(lowerbody2, 70, 42, -12.0F, 11.5F, -22.0F, 24, 5, 22, 0.0F, false));

        this.lowerbody1 = new AdvancedModelRenderer(this);
        this.lowerbody1.setRotationPoint(0.0F, 0.2F, -18.6F);
        this.lowerbody2.addChild(lowerbody1);
        this.setRotateAngle(lowerbody1, 0.0456F, 0.0F, 0.0F);
        this.lowerbody1.cubeList.add(new ModelBox(lowerbody1, 0, 64, -12.0F, -1.0F, -22.0F, 24, 15, 22, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -4.2F, -18.3F);
        this.lowerbody1.addChild(neck1);
        this.neck1.cubeList.add(new ModelBox(neck1, 176, 63, -7.5F, -2.0F, -9.0F, 15, 8, 7, 0.0F, false));

        this.belly1 = new AdvancedModelRenderer(this);
        this.belly1.setRotationPoint(0.0F, 13.7F, 2.0F);
        this.neck1.addChild(belly1);
        this.setRotateAngle(belly1, -0.7285F, 0.0F, 0.0F);


        this.belly1_r1 = new AdvancedModelRenderer(this);
        this.belly1_r1.setRotationPoint(0.0F, 7.4F, -14.7F);
        this.belly1.addChild(belly1_r1);
        this.setRotateAngle(belly1_r1, 0.0262F, 0.0F, 0.0F);
        this.belly1_r1.cubeList.add(new ModelBox(belly1_r1, 0, 167, -5.0F, -13.4F, -0.05F, 10, 13, 14, 0.0F, false));

        this.sidebelly2 = new AdvancedModelRenderer(this);
        this.sidebelly2.setRotationPoint(-2.6F, 6.0F, 0.1F);
        this.belly1.addChild(sidebelly2);
        this.setRotateAngle(sidebelly2, 0.0349F, 0.0F, -0.2276F);
        this.sidebelly2.cubeList.add(new ModelBox(sidebelly2, 170, 190, -2.5F, -9.0F, -14.95F, 3, 9, 14, 0.0F, false));

        this.sidebelly3 = new AdvancedModelRenderer(this);
        this.sidebelly3.setRotationPoint(2.6F, 6.0F, 0.1F);
        this.belly1.addChild(sidebelly3);
        this.setRotateAngle(sidebelly3, 0.0349F, 0.0F, 0.2276F);
        this.sidebelly3.cubeList.add(new ModelBox(sidebelly3, 170, 190, -0.5F, -9.0F, -14.95F, 3, 9, 14, 0.0F, true));

        this.upperneck1 = new AdvancedModelRenderer(this);
        this.upperneck1.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.neck1.addChild(upperneck1);
        this.setRotateAngle(upperneck1, 0.0911F, 0.0F, 0.0F);
        this.upperneck1.cubeList.add(new ModelBox(upperneck1, 190, 190, -3.0F, -5.0F, -9.0F, 6, 5, 9, 0.0F, false));

        this.sideneck1 = new AdvancedModelRenderer(this);
        this.sideneck1.setRotationPoint(-6.9F, -2.3F, 0.1F);
        this.neck1.addChild(sideneck1);
        this.setRotateAngle(sideneck1, 0.0911F, -0.0648F, 0.8158F);
        this.sideneck1.cubeList.add(new ModelBox(sideneck1, 98, 195, -0.5F, -6.0F, -9.0F, 4, 6, 7, 0.0F, false));

        this.sideneck2 = new AdvancedModelRenderer(this);
        this.sideneck2.setRotationPoint(6.9F, -2.3F, 0.1F);
        this.neck1.addChild(sideneck2);
        this.setRotateAngle(sideneck2, 0.0911F, 0.0648F, -0.8158F);
        this.sideneck2.cubeList.add(new ModelBox(sideneck2, 98, 195, -3.5F, -6.0F, -9.0F, 4, 6, 7, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -2.6F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.0911F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 177, 98, -4.0F, -6.0F, -12.0F, 8, 14, 6, 0.0F, false));

        this.head1 = new AdvancedModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -2.6F, -11.6F);
        this.neck2.addChild(head1);
        this.setRotateAngle(head1, -0.0456F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 152, 190, -2.5F, -2.0F, -8.0F, 5, 4, 10, 0.0F, false));

        this.rostrum1 = new AdvancedModelRenderer(this);
        this.rostrum1.setRotationPoint(0.0F, 0.5F, -9.2F);
        this.head1.addChild(rostrum1);
        this.rostrum1.cubeList.add(new ModelBox(rostrum1, 147, 91, -2.0F, -1.5F, -8.0F, 4, 3, 10, 0.0F, false));

        this.rostrum2 = new AdvancedModelRenderer(this);
        this.rostrum2.setRotationPoint(0.0F, 0.5F, -7.8F);
        this.rostrum1.addChild(rostrum2);
        this.rostrum2.cubeList.add(new ModelBox(rostrum2, 173, 15, -1.5F, -1.0F, -18.0F, 3, 2, 18, 0.0F, false));

        this.teeth2 = new AdvancedModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 1.0F, 0.3F);
        this.rostrum2.addChild(teeth2);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 130, 188, -1.0F, 0.0F, -18.0F, 2, 1, 18, 0.0F, false));

        this.beak1 = new AdvancedModelRenderer(this);
        this.beak1.setRotationPoint(0.0F, -0.9F, 1.7F);
        this.rostrum1.addChild(beak1);
        this.setRotateAngle(beak1, 0.0422F, 0.0F, 0.0F);
        this.beak1.cubeList.add(new ModelBox(beak1, 139, 105, -1.0F, -1.0F, -27.0F, 2, 1, 27, 0.0F, false));

        this.teeth1 = new AdvancedModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 0.7F, 1.2F);
        this.rostrum1.addChild(teeth1);
        this.setRotateAngle(teeth1, 0.0911F, 0.0F, 0.0F);
        this.teeth1.cubeList.add(new ModelBox(teeth1, 153, 133, -1.5F, 0.0F, -9.0F, 3, 1, 9, 0.0F, false));

        this.jaw1 = new AdvancedModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 3.5F, 0.1F);
        this.head1.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 72, 145, -2.5F, -1.5F, -8.0F, 5, 3, 10, 0.0F, false));

        this.lowerrostrum1 = new AdvancedModelRenderer(this);
        this.lowerrostrum1.setRotationPoint(0.0F, 0.0F, -9.2F);
        this.jaw1.addChild(lowerrostrum1);
        this.lowerrostrum1.cubeList.add(new ModelBox(lowerrostrum1, 192, 78, -2.0F, -1.5F, -8.0F, 4, 2, 10, 0.0F, false));

        this.lowerrostrum2 = new AdvancedModelRenderer(this);
        this.lowerrostrum2.setRotationPoint(0.0F, 0.1F, -8.0F);
        this.lowerrostrum1.addChild(lowerrostrum2);
        this.lowerrostrum2.cubeList.add(new ModelBox(lowerrostrum2, 174, 44, -1.5F, -1.61F, -17.9F, 3, 1, 18, 0.0F, false));

        this.teeth4 = new AdvancedModelRenderer(this);
        this.teeth4.setRotationPoint(0.0F, -1.4F, 0.3F);
        this.lowerrostrum2.addChild(teeth4);
        this.teeth4.cubeList.add(new ModelBox(teeth4, 52, 181, -1.0F, -1.0F, -18.0F, 2, 1, 18, 0.0F, false));

        this.lowerbeak2 = new AdvancedModelRenderer(this);
        this.lowerbeak2.setRotationPoint(0.0F, 0.5F, -7.3F);
        this.lowerrostrum1.addChild(lowerbeak2);
        this.setRotateAngle(lowerbeak2, -0.0543F, 0.0F, 0.0F);
        this.lowerbeak2.cubeList.add(new ModelBox(lowerbeak2, 30, 180, -1.0F, -1.0F, -18.0F, 2, 1, 18, 0.0F, false));

        this.beak3 = new AdvancedModelRenderer(this);
        this.beak3.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.lowerrostrum1.addChild(beak3);
        this.setRotateAngle(beak3, -0.0873F, 0.0F, 0.0F);
        this.beak3.cubeList.add(new ModelBox(beak3, 156, 15, -1.5F, -0.5F, -8.0F, 3, 1, 10, 0.0F, false));

        this.teeth3 = new AdvancedModelRenderer(this);
        this.teeth3.setRotationPoint(0.0F, -0.8F, 1.2F);
        this.lowerrostrum1.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.0456F, 0.0F, 0.0F);
        this.teeth3.cubeList.add(new ModelBox(teeth3, 92, 145, -1.5F, -1.0F, -9.0F, 3, 1, 9, 0.0F, false));

        this.gums1 = new AdvancedModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.5F, -3.6F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.3187F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 196, 0, -2.0F, -5.1F, -3.5F, 4, 5, 7, 0.0F, false));

        this.dewlap1 = new AdvancedModelRenderer(this);
        this.dewlap1.setRotationPoint(0.1F, 4.55F, 1.5F);
        this.jaw1.addChild(dewlap1);
        this.setRotateAngle(dewlap1, -0.6829F, 0.0F, 0.0F);
        this.dewlap1.cubeList.add(new ModelBox(dewlap1, 29, 201, -2.1F, -2.5F, -8.0F, 4, 5, 8, -0.01F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -2.2F, -0.2F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.3187F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 96, 35, -2.0F, -1.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.flipper1 = new AdvancedModelRenderer(this);
        this.flipper1.setRotationPoint(-11.8F, 7.4F, -20.6F);
        this.lowerbody1.addChild(flipper1);
        this.setRotateAngle(flipper1, 0.2618F, -0.0911F, 0.2731F);
        this.flipper1.cubeList.add(new ModelBox(flipper1, 0, 64, -1.0F, 0.0F, -2.0F, 2, 12, 8, 0.0F, false));

        this.flipperfingers1 = new AdvancedModelRenderer(this);
        this.flipperfingers1.setRotationPoint(0.0F, 1.4F, -3.2F);
        this.flipper1.addChild(flipperfingers1);
        this.flipperfingers1.cubeList.add(new ModelBox(flipperfingers1, 122, 214, 0.0F, 0.0F, 0.0F, 0, 29, 13, 0.0F, false));

        this.flipper2 = new AdvancedModelRenderer(this);
        this.flipper2.setRotationPoint(11.8F, 7.4F, -20.6F);
        this.lowerbody1.addChild(flipper2);
        this.setRotateAngle(flipper2, 0.2618F, 0.0911F, -0.2731F);
        this.flipper2.cubeList.add(new ModelBox(flipper2, 0, 64, -1.0F, 0.0F, -2.0F, 2, 12, 8, 0.0F, true));

        this.flipperfingers2 = new AdvancedModelRenderer(this);
        this.flipperfingers2.setRotationPoint(0.0F, 1.4F, -3.2F);
        this.flipper2.addChild(flipperfingers2);
        this.flipperfingers2.cubeList.add(new ModelBox(flipperfingers2, 122, 166, 0.0F, 2.0F, 0.0F, 0, 27, 13, 0.0F, true));

        this.body3h = new AdvancedModelRenderer(this);
        this.body3h.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerbody1.addChild(body3h);
        this.body3h.cubeList.add(new ModelBox(body3h, 140, 33, -3.5F, -11.0F, -20.0F, 7, 10, 19, 0.0F, false));

        this.underbelly2 = new AdvancedModelRenderer(this);
        this.underbelly2.setRotationPoint(0.0F, 13.55F, -19.3F);
        this.lowerbody1.addChild(underbelly2);
        this.setRotateAngle(underbelly2, -0.3491F, 0.0F, 0.0F);
        this.underbelly2.cubeList.add(new ModelBox(underbelly2, 92, 109, -10.0F, -5.0F, 0.0F, 20, 6, 17, 0.0F, false));

        this.sidebody1 = new AdvancedModelRenderer(this);
        this.sidebody1.setRotationPoint(-11.65F, -0.8F, 0.5F);
        this.lowerbody1.addChild(sidebody1);
        this.setRotateAngle(sidebody1, 0.0F, 0.0F, 0.714F);
        this.sidebody1.cubeList.add(new ModelBox(sidebody1, 40, 145, -0.5F, -13.0F, -22.0F, 5, 13, 22, 0.0F, false));

        this.sidebody4 = new AdvancedModelRenderer(this);
        this.sidebody4.setRotationPoint(11.65F, -0.8F, 0.5F);
        this.lowerbody1.addChild(sidebody4);
        this.setRotateAngle(sidebody4, 0.0F, 0.0F, -0.714F);
        this.sidebody4.cubeList.add(new ModelBox(sidebody4, 40, 145, -4.5F, -13.0F, -22.0F, 5, 13, 22, 0.0F, true));

        this.body2y = new AdvancedModelRenderer(this);
        this.body2y.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerbody2.addChild(body2y);
        this.body2y.cubeList.add(new ModelBox(body2y, 0, 134, -4.5F, -11.0F, -22.0F, 9, 11, 22, 0.01F, false));

        this.sidebody2l = new AdvancedModelRenderer(this);
        this.sidebody2l.setRotationPoint(-12.7F, -0.875F, 0.0F);
        this.body2y.addChild(sidebody2l);
        this.setRotateAngle(sidebody2l, 0.0F, 0.0F, 0.7576F);
        this.sidebody2l.cubeList.add(new ModelBox(sidebody2l, 131, 143, -1.0F, -13.0F, -22.0F, 5, 14, 22, 0.0F, false));

        this.sidebody5 = new AdvancedModelRenderer(this);
        this.sidebody5.setRotationPoint(12.7F, -0.875F, 0.0F);
        this.body2y.addChild(sidebody5);
        this.setRotateAngle(sidebody5, 0.0F, 0.0F, -0.7576F);
        this.sidebody5.cubeList.add(new ModelBox(sidebody5, 131, 143, -4.0F, -13.0F, -22.0F, 5, 14, 22, 0.0F, true));

        this.sadfin1 = new AdvancedModelRenderer(this);
        this.sadfin1.setRotationPoint(0.0F, -9.5F, -13.0F);
        this.lowerbody2.addChild(sadfin1);
        this.setRotateAngle(sadfin1, -0.5918F, 0.0F, 0.0F);
        this.sadfin1.cubeList.add(new ModelBox(sadfin1, 0, 134, -1.0F, -5.0F, -3.0F, 2, 5, 9, 0.0F, false));

        this.sadfin2 = new AdvancedModelRenderer(this);
        this.sadfin2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.sadfin1.addChild(sadfin2);
        this.setRotateAngle(sadfin2, 0.1361F, 0.0F, 0.0F);
        this.sadfin2.cubeList.add(new ModelBox(sadfin2, 0, 0, 0.0F, -9.0F, -2.0F, 0, 9, 11, 0.0F, false));

        this.underbelly3 = new AdvancedModelRenderer(this);
        this.underbelly3.setRotationPoint(0.0F, 15.3F, -16.2F);
        this.lowerbody3.addChild(underbelly3);
        this.setRotateAngle(underbelly3, 0.3491F, 0.0F, 0.0F);
        this.underbelly3.cubeList.add(new ModelBox(underbelly3, 120, 69, -10.0F, 0.0F, 0.0F, 20, 6, 16, 0.0F, false));
        this.underbelly3.cubeList.add(new ModelBox(underbelly3, 6, 127, -10.0F, -1.0F, 0.0F, 20, 1, 5, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.9F, 0.0F);
        this.lowerbody3.addChild(body1);
        this.setRotateAngle(body1, -0.0349F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 163, 133, -3.5F, -11.3F, -18.0F, 7, 11, 18, 0.0F, false));

        this.sidebody3bb = new AdvancedModelRenderer(this);
        this.sidebody3bb.setRotationPoint(-10.9F, -1.1F, 0.0F);
        this.lowerbody3.addChild(sidebody3bb);
        this.setRotateAngle(sidebody3bb, 0.0F, 0.0281F, 0.6946F);
        this.sidebody3bb.cubeList.add(new ModelBox(sidebody3bb, 76, 165, 0.0F, -12.0F, -18.0F, 5, 12, 18, 0.0F, false));

        this.sidebody6 = new AdvancedModelRenderer(this);
        this.sidebody6.setRotationPoint(10.9F, -1.1F, 0.0F);
        this.lowerbody3.addChild(sidebody6);
        this.setRotateAngle(sidebody6, 0.0F, -0.0281F, -0.6946F);
        this.sidebody6.cubeList.add(new ModelBox(sidebody6, 76, 165, -5.0F, -12.0F, -18.0F, 5, 12, 18, 0.0F, true));

        this.body2a = new AdvancedModelRenderer(this);
        this.body2a.setRotationPoint(0.0F, 1.2F, 0.4F);
        this.tailbase1.addChild(body2a);
        this.setRotateAngle(body2a, -0.0281F, 0.0F, 0.0F);
        this.body2a.cubeList.add(new ModelBox(body2a, 55, 109, -3.0F, -11.0F, 0.0F, 6, 11, 25, 0.0F, false));

        this.sidebody2xx = new AdvancedModelRenderer(this);
        this.sidebody2xx.setRotationPoint(-7.45F, -4.85F, -0.9F);
        this.body2a.addChild(sidebody2xx);
        this.setRotateAngle(sidebody2xx, 0.0044F, 0.0F, 0.6267F);
        this.sidebody2xx.cubeList.add(new ModelBox(sidebody2xx, 91, 132, 0.0F, -7.45F, 0.0F, 5, 7, 26, 0.0F, false));
        this.sidebody2xx.cubeList.add(new ModelBox(sidebody2xx, 91, 138, 0.0F, -0.875F, 0.0F, 5, 1, 26, -0.01F, false));

        this.sidebody9 = new AdvancedModelRenderer(this);
        this.sidebody9.setRotationPoint(7.45F, -4.85F, -0.9F);
        this.body2a.addChild(sidebody9);
        this.setRotateAngle(sidebody9, 0.0044F, 0.0F, -0.6267F);
        this.sidebody9.cubeList.add(new ModelBox(sidebody9, 91, 132, -5.0F, -7.45F, 0.0F, 5, 7, 26, 0.0F, true));
        this.sidebody9.cubeList.add(new ModelBox(sidebody9, 91, 138, -5.0F, -0.875F, 0.0F, 5, 1, 26, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck2.offsetY = -0.001F;
        this.jaw1.rotateAngleX = (float) Math.toRadians(25);
        this.head1.rotateAngleX = (float) Math.toRadians(-15);
        this.neck2.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.2618F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(tailbase1, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.0519F, -0.3006F, 0.0547F);
        this.setRotateAngle(undertail1, 0.2295F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(sidebody2, 0.0F, 0.0F, 0.5463F);
        this.setRotateAngle(sidebody7, 0.0F, 0.0F, -0.5463F);
        this.setRotateAngle(tail2, -0.134F, -0.2163F, 0.0289F);
        this.setRotateAngle(undertail2, 0.1859F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(sidebody2, 0.0F, 0.0F, 0.5463F);
        this.setRotateAngle(sidebody8, 0.0F, 0.0F, -0.5463F);
        this.setRotateAngle(tail3, -0.136F, -0.2162F, 0.0294F);
        //this.setRotateAngle(body3, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(sidetail3, 0.0F, 0.0F, 0.4079F);
        this.setRotateAngle(sidetail2, 0.0F, 0.0F, -0.4079F);
        this.setRotateAngle(tail4, -0.1612F, -0.2726F, -0.0416F);
        this.setRotateAngle(fluke1, -0.4243F, -0.2505F, -0.1231F);
        this.setRotateAngle(belly3, 0.406F, 0.0F, 0.0F);
        this.setRotateAngle(rearflipper1, 0.5325F, -0.0777F, 0.5281F);
        this.setRotateAngle(rearflipper2, 0.4911F, 0.5465F, -0.5668F);
        this.setRotateAngle(lowerbody3, -0.0861F, 0.1304F, -0.0112F);
        this.setRotateAngle(lowerbody2, 0.002F, 0.2182F, 0.0004F);
        this.setRotateAngle(lowerbody1, 0.002F, 0.2618F, 0.0005F);
        this.setRotateAngle(neck1, -0.0447F, 0.218F, -0.0097F);
        this.setRotateAngle(belly1, -0.7285F, 0.0F, 0.0F);
        this.setRotateAngle(belly1_r1, 0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(sidebelly2, 0.0349F, 0.0F, -0.2276F);
        this.setRotateAngle(sidebelly3, 0.0349F, 0.0F, 0.2276F);
        this.setRotateAngle(upperneck1, 0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(sideneck1, 0.0911F, -0.0648F, 0.8158F);
        this.setRotateAngle(sideneck2, 0.0911F, 0.0648F, -0.8158F);
        this.setRotateAngle(neck2, 0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(head1, -0.3671F, 0.3365F, -0.0946F);
        this.setRotateAngle(beak1, 0.0422F, 0.0F, 0.0F);
        this.setRotateAngle(teeth1, 0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(jaw1, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(lowerbeak2, -0.0543F, 0.0F, 0.0F);
        this.setRotateAngle(beak3, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(teeth3, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(gums1, -0.3187F, 0.0F, 0.0F);
        this.setRotateAngle(dewlap1, -0.6829F, 0.0F, 0.0F);
        this.setRotateAngle(head2, 0.3187F, 0.0F, 0.0F);
        this.setRotateAngle(flipper1, 0.1601F, -0.6322F, 0.9477F);
        this.setRotateAngle(flipper2, 0.1429F, 0.5952F, -1.005F);
        this.setRotateAngle(underbelly2, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(sidebody1, 0.0F, 0.0F, 0.714F);
        this.setRotateAngle(sidebody4, 0.0F, 0.0F, -0.714F);
        this.setRotateAngle(sidebody2, 0.0F, 0.0F, 0.7576F);
        this.setRotateAngle(sidebody5, 0.0F, 0.0F, -0.7576F);
        this.setRotateAngle(sadfin1, -0.5918F, 0.0F, 0.0F);
        this.setRotateAngle(sadfin2, 0.1361F, 0.0F, 0.0F);
        this.setRotateAngle(underbelly3, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.0349F, 0.0F, 0.0F);
        //this.setRotateAngle(sidebody3, 0.0F, 0.0281F, 0.6946F);
        this.setRotateAngle(sidebody6, 0.0F, -0.0281F, -0.6946F);
        this.setRotateAngle(body2, -0.0281F, 0.0F, 0.0F);
        this.setRotateAngle(sidebody2, 0.0044F, 0.0F, 0.6267F);
        this.setRotateAngle(sidebody9, 0.0044F, 0.0F, -0.6267F);
        this.root.offsetY = -0.28F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(root, 0.2618F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(tailbase1, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.0519F, -0.3006F, 0.0547F);
        this.setRotateAngle(undertail1, 0.2295F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(sidebody2, 0.0F, 0.0F, 0.5463F);
        this.setRotateAngle(sidebody7, 0.0F, 0.0F, -0.5463F);
        this.setRotateAngle(tail2, -0.134F, -0.2163F, 0.0289F);
        this.setRotateAngle(undertail2, 0.1859F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(sidebody2, 0.0F, 0.0F, 0.5463F);
        this.setRotateAngle(sidebody8, 0.0F, 0.0F, -0.5463F);
        this.setRotateAngle(tail3, -0.136F, -0.2162F, 0.0294F);
        //this.setRotateAngle(body3, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(sidetail3, 0.0F, 0.0F, 0.4079F);
        this.setRotateAngle(sidetail2, 0.0F, 0.0F, -0.4079F);
        this.setRotateAngle(tail4, -0.1612F, -0.2726F, -0.0416F);
        this.setRotateAngle(fluke1, -0.4243F, -0.2505F, -0.1231F);
        this.setRotateAngle(belly3, 0.406F, 0.0F, 0.0F);
        this.setRotateAngle(rearflipper1, 0.5325F, -0.0777F, 0.5281F);
        this.setRotateAngle(rearflipper2, 0.4911F, 0.5465F, -0.5668F);
        this.setRotateAngle(lowerbody3, -0.0861F, 0.1304F, -0.0112F);
        this.setRotateAngle(lowerbody2, 0.002F, 0.2182F, 0.0004F);
        this.setRotateAngle(lowerbody1, 0.002F, 0.2618F, 0.0005F);
        this.setRotateAngle(neck1, -0.0447F, 0.218F, -0.0097F);
        this.setRotateAngle(belly1, -0.7285F, 0.0F, 0.0F);
        this.setRotateAngle(belly1_r1, 0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(sidebelly2, 0.0349F, 0.0F, -0.2276F);
        this.setRotateAngle(sidebelly3, 0.0349F, 0.0F, 0.2276F);
        this.setRotateAngle(upperneck1, 0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(sideneck1, 0.0911F, -0.0648F, 0.8158F);
        this.setRotateAngle(sideneck2, 0.0911F, 0.0648F, -0.8158F);
        this.setRotateAngle(neck2, 0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(head1, -0.3671F, 0.3365F, -0.0946F);
        this.setRotateAngle(beak1, 0.0422F, 0.0F, 0.0F);
        this.setRotateAngle(teeth1, 0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(jaw1, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(lowerbeak2, -0.0543F, 0.0F, 0.0F);
        this.setRotateAngle(beak3, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(teeth3, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(gums1, -0.3187F, 0.0F, 0.0F);
        this.setRotateAngle(dewlap1, -0.6829F, 0.0F, 0.0F);
        this.setRotateAngle(head2, 0.3187F, 0.0F, 0.0F);
        this.setRotateAngle(flipper1, 0.1601F, -0.6322F, 0.9477F);
        this.setRotateAngle(flipper2, 0.1429F, 0.5952F, -1.005F);
        this.setRotateAngle(underbelly2, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(sidebody1, 0.0F, 0.0F, 0.714F);
        this.setRotateAngle(sidebody4, 0.0F, 0.0F, -0.714F);
        this.setRotateAngle(sidebody2, 0.0F, 0.0F, 0.7576F);
        this.setRotateAngle(sidebody5, 0.0F, 0.0F, -0.7576F);
        this.setRotateAngle(sadfin1, -0.5918F, 0.0F, 0.0F);
        this.setRotateAngle(sadfin2, 0.1361F, 0.0F, 0.0F);
        this.setRotateAngle(underbelly3, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.0349F, 0.0F, 0.0F);
        //this.setRotateAngle(sidebody3, 0.0F, 0.0281F, 0.6946F);
        this.setRotateAngle(sidebody6, 0.0F, -0.0281F, -0.6946F);
        this.setRotateAngle(body2, -0.0281F, 0.0F, 0.0F);
        this.setRotateAngle(sidebody2, 0.0044F, 0.0F, 0.6267F);
        this.setRotateAngle(sidebody9, 0.0044F, 0.0F, -0.6267F);
        this.root.offsetY = 0.23F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.root.offsetY = -0.4F;
        this.root.offsetZ = 1.0F;

       AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3, this.tail4};

        float speed = 0.16F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.8F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.385F * still, -1.85, f2, 0.6F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.555F * still, -2.55, f2, 0.6F * still);
            }
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.swing(root, speed * 0.5F, 0.002F, true, 0, 0, f2, 0.8F);
        }
        else {
            //Dont swing if on land - it loooks dumb
            //this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(flipper1, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(flipper1, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
        this.walk(flipper1, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(flipper2, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(flipper2, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
        this.walk(flipper2, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(rearflipper1, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
        this.swing(rearflipper1, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        this.walk(rearflipper1, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        this.flap(rearflipper2, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
        this.swing(rearflipper2, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
        this.walk(rearflipper2, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = 0F;
            this.bob(root, -speed * 1.8F, 0.02F, false, f2, 1);
            this.walk(jaw1, (float) (speed * 1.8F), 0.15F, true, 1, -0.15F, f2, 0.5F);
            this.chainWave(fishTail, speed * 1.5F, 0.0025F, -0.1, f2, 0.4F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.01F, -0.25, f2, 0.2F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head1, 0,0,-0.2F);
        animator.rotate(this.head1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

