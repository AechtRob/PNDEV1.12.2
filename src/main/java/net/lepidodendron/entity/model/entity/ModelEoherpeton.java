package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEoherpeton;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEoherpeton extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer bodymiddleupper_r1;
    private final AdvancedModelRenderer bodymiddleupper_r2;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodyfrontfluke_r1;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer box_r1;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer box_r2;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neckfluke_r1;
    private final AdvancedModelRenderer neck4_r1;
    private final AdvancedModelRenderer neck1_r1;
    private final AdvancedModelRenderer upperhead;
    private final AdvancedModelRenderer upperhead5_r1;
    private final AdvancedModelRenderer upperhead4_r1;
    private final AdvancedModelRenderer upperhead3_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw4_r1;
    private final AdvancedModelRenderer jaw3_r1;
    private final AdvancedModelRenderer jaw3_r2;
    private final AdvancedModelRenderer jaw2_r1;
    private final AdvancedModelRenderer jaw2_r2;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer jaw3_r3;
    private final AdvancedModelRenderer bodyback;
    private final AdvancedModelRenderer bodybackflukeF_r1;
    private final AdvancedModelRenderer bodyback_r1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail1fluke_r1;
    private final AdvancedModelRenderer tail1_r1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail2fluke_r1;
    private final AdvancedModelRenderer tail2_r1;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4_r1;
    private final AdvancedModelRenderer tail3_r1;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer box_r3;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer box_r4;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer box_r5;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer box_r6;
    private final AdvancedModelRenderer legleft3;

    private ModelAnimator animator;

    public ModelEoherpeton() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.5F, 3.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0897F, -8.0253F, -8.9989F, 6, 6, 12, 0.0F, false));

        this.bodymiddleupper_r1 = new AdvancedModelRenderer(this);
        this.bodymiddleupper_r1.setRotationPoint(-0.0897F, -8.7781F, -5.9728F);
        this.main.addChild(bodymiddleupper_r1);
        this.setRotateAngle(bodymiddleupper_r1, -0.0698F, 0.0F, 0.0F);
        this.bodymiddleupper_r1.cubeList.add(new ModelBox(bodymiddleupper_r1, 28, 31, -1.5F, -0.0704F, -0.0319F, 3, 1, 9, 0.01F, false));

        this.bodymiddleupper_r2 = new AdvancedModelRenderer(this);
        this.bodymiddleupper_r2.setRotationPoint(-0.0897F, -8.5753F, -9.0989F);
        this.main.addChild(bodymiddleupper_r2);
        this.setRotateAngle(bodymiddleupper_r2, 0.0873F, 0.0F, 0.0F);
        this.bodymiddleupper_r2.cubeList.add(new ModelBox(bodymiddleupper_r2, 56, 9, -1.5F, 0.0F, 0.1F, 3, 1, 3, 0.0F, false));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(-0.0897F, -5.0253F, -8.9989F);
        this.main.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 43, -2.5F, -2.25F, -4.0F, 5, 4, 5, 0.0F, false));
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 18, 53, -2.0F, 0.85F, -4.0F, 4, 2, 5, 0.0F, false));

        this.bodyfrontfluke_r1 = new AdvancedModelRenderer(this);
        this.bodyfrontfluke_r1.setRotationPoint(0.501F, -2.7137F, -3.9477F);
        this.bodyfront.addChild(bodyfrontfluke_r1);
        this.setRotateAngle(bodyfrontfluke_r1, 0.1876F, 0.0F, 0.0F);
        this.bodyfrontfluke_r1.cubeList.add(new ModelBox(bodyfrontfluke_r1, 60, 43, -2.001F, -0.0523F, 0.008F, 3, 2, 4, 0.01F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-1.5F, 1.5F, -1.0F);
        this.bodyfront.addChild(armright);
        this.setRotateAngle(armright, 0.0F, 0.0F, 0.6981F);


        this.box_r1 = new AdvancedModelRenderer(this);
        this.box_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armright.addChild(box_r1);
        this.setRotateAngle(box_r1, -0.0873F, 0.2618F, -0.7418F);
        this.box_r1.cubeList.add(new ModelBox(box_r1, 64, 64, -4.0F, -1.0F, -1.5F, 4, 2, 2, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-2.5F, 2.0F, 0.1F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, -0.2427F, 0.0992F, -0.4921F);
        this.armright2.cubeList.add(new ModelBox(armright2, 24, 65, -1.0F, -0.1F, -0.7F, 2, 4, 2, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(0.037F, 3.0892F, 0.7259F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.2264F, 0.0927F, -0.2076F);
        this.armright3.cubeList.add(new ModelBox(armright3, 54, 27, -1.49F, 0.1F, -2.5F, 3, 1, 3, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(1.5F, 1.5F, -1.0F);
        this.bodyfront.addChild(armleft);
        this.setRotateAngle(armleft, 0.0F, 0.0F, -0.6981F);


        this.box_r2 = new AdvancedModelRenderer(this);
        this.box_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armleft.addChild(box_r2);
        this.setRotateAngle(box_r2, -0.0873F, -0.2618F, 0.7418F);
        this.box_r2.cubeList.add(new ModelBox(box_r2, 64, 64, 0.0F, -1.0F, -1.5F, 4, 2, 2, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(2.5F, 2.0F, 0.1F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, -0.2427F, -0.0992F, 0.4921F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 24, 65, -1.0F, -0.1F, -0.7F, 2, 4, 2, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(-0.037F, 3.0892F, 0.7259F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.2264F, -0.0927F, 0.2076F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 54, 27, -1.51F, 0.1F, -2.5F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);


        this.neckfluke_r1 = new AdvancedModelRenderer(this);
        this.neckfluke_r1.setRotationPoint(0.5F, -1.375F, -1.85F);
        this.neck.addChild(neckfluke_r1);
        this.setRotateAngle(neckfluke_r1, 0.3491F, 0.0F, 0.0F);
        this.neckfluke_r1.cubeList.add(new ModelBox(neckfluke_r1, 50, 60, -2.0F, -0.1F, -1.7F, 3, 2, 4, 0.0F, false));

        this.neck4_r1 = new AdvancedModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.5F, 3.3744F, -3.0609F);
        this.neck.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.0175F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 60, 49, -2.0F, -0.9805F, 0.0222F, 3, 1, 4, 0.0F, false));
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 54, 13, -2.5F, -3.9805F, 0.0222F, 4, 3, 4, 0.0F, false));

        this.neck1_r1 = new AdvancedModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.neck.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.1309F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 54, 20, -2.5F, -1.0F, -3.3F, 4, 3, 4, -0.003F, false));

        this.upperhead = new AdvancedModelRenderer(this);
        this.upperhead.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.neck.addChild(upperhead);
        this.upperhead.cubeList.add(new ModelBox(upperhead, 52, 31, -2.0F, -0.999F, -5.0F, 4, 2, 5, 0.02F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 22, 32, -1.9F, 0.251F, -5.0F, 0, 1, 3, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 54, 66, -1.5F, 0.0F, -7.85F, 3, 1, 2, 0.02F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 36, 53, -1.5F, 0.25F, -7.65F, 3, 1, 0, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 52, 38, -1.5F, -1.0F, -6.0F, 3, 2, 1, 0.015F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 20, 45, -1.39F, 0.35F, -6.85F, 0, 1, 1, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 22, 32, 1.9F, 0.251F, -5.0F, 0, 1, 3, 0.0F, true));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 20, 45, 1.39F, 0.35F, -6.85F, 0, 1, 1, 0.0F, true));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 12, 61, -2.05F, -1.0F, -4.35F, 1, 1, 1, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 12, 61, 1.05F, -1.0F, -4.35F, 1, 1, 1, 0.0F, true));

        this.upperhead5_r1 = new AdvancedModelRenderer(this);
        this.upperhead5_r1.setRotationPoint(0.5F, -1.6F, -4.7F);
        this.upperhead.addChild(upperhead5_r1);
        this.setRotateAngle(upperhead5_r1, 0.1658F, 0.0F, 0.0F);
        this.upperhead5_r1.cubeList.add(new ModelBox(upperhead5_r1, 50, 54, -2.5F, -0.0765F, 0.5373F, 4, 2, 4, -0.002F, false));

        this.upperhead4_r1 = new AdvancedModelRenderer(this);
        this.upperhead4_r1.setRotationPoint(0.0F, -0.875F, -6.35F);
        this.upperhead.addChild(upperhead4_r1);
        this.setRotateAngle(upperhead4_r1, 0.3665F, 0.0F, 0.0F);
        this.upperhead4_r1.cubeList.add(new ModelBox(upperhead4_r1, 66, 27, -1.5F, -0.0426F, 0.3295F, 3, 2, 2, 0.0F, false));

        this.upperhead3_r1 = new AdvancedModelRenderer(this);
        this.upperhead3_r1.setRotationPoint(0.5F, -0.05F, -7.7F);
        this.upperhead.addChild(upperhead3_r1);
        this.setRotateAngle(upperhead3_r1, 0.5236F, 0.0F, 0.0F);
        this.upperhead3_r1.cubeList.add(new ModelBox(upperhead3_r1, 44, 66, -2.0F, -0.0263F, -0.0837F, 3, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7F, -0.15F);
        this.upperhead.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);


        this.jaw4_r1 = new AdvancedModelRenderer(this);
        this.jaw4_r1.setRotationPoint(0.5F, 0.6F, -5.25F);
        this.jaw.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.0349F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 20, 43, 0.9F, -0.0888F, -1.3072F, 0, 1, 1, 0.0F, true));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 20, 43, -1.9F, -0.0888F, -1.3072F, 0, 1, 1, 0.0F, false));

        this.jaw3_r1 = new AdvancedModelRenderer(this);
        this.jaw3_r1.setRotationPoint(-0.05F, 0.1F, -2.35F);
        this.jaw.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.1745F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 22, 36, 1.9F, -0.1F, -2.45F, 0, 1, 3, 0.0F, true));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 22, 36, -1.8F, -0.1F, -2.45F, 0, 1, 3, 0.0F, false));

        this.jaw3_r2 = new AdvancedModelRenderer(this);
        this.jaw3_r2.setRotationPoint(0.5F, 0.45F, -5.65F);
        this.jaw.addChild(jaw3_r2);
        this.setRotateAngle(jaw3_r2, 0.0349F, 0.0F, 0.0F);
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 22, 40, -2.0F, 0.0112F, -1.8072F, 3, 1, 0, 0.0F, false));

        this.jaw2_r1 = new AdvancedModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.5F, 0.7F, -5.75F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, 0.0349F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 64, 60, -2.0F, 0.0112F, -1.8072F, 3, 1, 3, 0.01F, false));

        this.jaw2_r2 = new AdvancedModelRenderer(this);
        this.jaw2_r2.setRotationPoint(0.0F, 1.6F, -5.65F);
        this.jaw.addChild(jaw2_r2);
        this.setRotateAngle(jaw2_r2, 0.0873F, 0.0F, 0.0F);
        this.jaw2_r2.cubeList.add(new ModelBox(jaw2_r2, 60, 38, -2.0F, -0.8925F, 0.9006F, 4, 1, 4, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(throat);
        this.throat.cubeList.add(new ModelBox(throat, 12, 65, -1.5F, 0.7075F, -5.3994F, 3, 1, 3, 0.0F, false));

        this.jaw3_r3 = new AdvancedModelRenderer(this);
        this.jaw3_r3.setRotationPoint(0.0F, 2.9F, -7.25F);
        this.throat.addChild(jaw3_r3);
        this.setRotateAngle(jaw3_r3, 0.2618F, 0.0F, 0.0F);
        this.jaw3_r3.cubeList.add(new ModelBox(jaw3_r3, 0, 61, -1.5F, -2.8925F, 4.9506F, 3, 3, 3, -0.002F, false));

        this.bodyback = new AdvancedModelRenderer(this);
        this.bodyback.setRotationPoint(-0.0897F, -4.9253F, 2.5011F);
        this.main.addChild(bodyback);


        this.bodybackflukeF_r1 = new AdvancedModelRenderer(this);
        this.bodybackflukeF_r1.setRotationPoint(0.5F, 0.2F, 0.0F);
        this.bodyback.addChild(bodybackflukeF_r1);
        this.setRotateAngle(bodybackflukeF_r1, -0.192F, 0.0F, 0.0F);
        this.bodybackflukeF_r1.cubeList.add(new ModelBox(bodybackflukeF_r1, 36, 54, -1.0F, -3.45F, -0.5F, 1, 2, 6, 0.0F, false));

        this.bodyback_r1 = new AdvancedModelRenderer(this);
        this.bodyback_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.bodyback.addChild(bodyback_r1);
        this.setRotateAngle(bodyback_r1, -0.1745F, 0.0F, 0.0F);
        this.bodyback_r1.cubeList.add(new ModelBox(bodyback_r1, 0, 32, -3.0F, -2.5F, -0.5F, 5, 5, 6, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.4272F, 5.4322F);
        this.bodyback.addChild(tail1);


        this.tail1fluke_r1 = new AdvancedModelRenderer(this);
        this.tail1fluke_r1.setRotationPoint(1.0F, 3.8663F, 19.0224F);
        this.tail1.addChild(tail1fluke_r1);
        this.setRotateAngle(tail1fluke_r1, -0.1309F, 0.0F, 0.0F);
        this.tail1fluke_r1.cubeList.add(new ModelBox(tail1fluke_r1, 22, 41, -1.0F, -4.1935F, -19.5546F, 0, 2, 10, 0.0F, false));

        this.tail1_r1 = new AdvancedModelRenderer(this);
        this.tail1_r1.setRotationPoint(0.5F, 2.25F, -0.75F);
        this.tail1.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, -0.1309F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 0, 18, -2.0F, -3.5F, -0.5F, 3, 3, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.9579F, 9.7678F);
        this.tail1.addChild(tail2);


        this.tail2fluke_r1 = new AdvancedModelRenderer(this);
        this.tail2fluke_r1.setRotationPoint(1.0F, 2.4084F, 9.2546F);
        this.tail2.addChild(tail2fluke_r1);
        this.setRotateAngle(tail2fluke_r1, -0.0873F, 0.0F, 0.0F);
        this.tail2fluke_r1.cubeList.add(new ModelBox(tail2fluke_r1, 36, 0, -1.01F, -5.1935F, -9.5F, 0, 3, 10, 0.0F, false));

        this.tail2_r1 = new AdvancedModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.5F, 0.25F, -0.1F);
        this.tail2.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.0873F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 28, 18, -1.5F, -1.3851F, -1.0461F, 2, 2, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6149F, 9.8F);
        this.tail2.addChild(tail3);


        this.tail4_r1 = new AdvancedModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.5F, 1.0F, -0.1F);
        this.tail3.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, -0.0262F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 56, 0, -0.5F, -2.9F, 9.0546F, 0, 3, 6, 0.0F, false));
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 42, 41, -0.5F, -3.9F, 0.0546F, 0, 4, 9, 0.0F, false));

        this.tail3_r1 = new AdvancedModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.0F, 0.2684F, 0.0518F);
        this.tail3.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, -0.0175F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 0, 52, -0.5F, -0.8486F, -0.0152F, 1, 1, 8, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.5F, 1.0F, 1.75F);
        this.bodyback.addChild(legright);
        this.setRotateAngle(legright, 0.0F, 0.0F, 0.6109F);


        this.box_r3 = new AdvancedModelRenderer(this);
        this.box_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legright.addChild(box_r3);
        this.setRotateAngle(box_r3, -0.0873F, -0.1309F, -0.7418F);
        this.box_r3.cubeList.add(new ModelBox(box_r3, 36, 13, -4.5F, -1.0F, -1.5F, 5, 2, 3, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-2.5F, 2.0F, -0.5F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.1874F, 0.032F, -0.1477F);


        this.box_r4 = new AdvancedModelRenderer(this);
        this.box_r4.setRotationPoint(0.0F, 0.875F, -0.525F);
        this.legright2.addChild(box_r4);
        this.setRotateAngle(box_r4, -0.1571F, 0.0F, 0.0F);
        this.box_r4.cubeList.add(new ModelBox(box_r4, 34, 62, -1.6F, -0.5F, -1.0F, 2, 4, 3, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.1717F, 3.3954F, 0.5987F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, -0.1487F, 0.048F, -0.4369F);
        this.legright3.cubeList.add(new ModelBox(legright3, 18, 60, -2.6013F, 0.2F, -4.2F, 4, 1, 4, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.5F, 1.0F, 1.75F);
        this.bodyback.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.0F, -0.6109F);


        this.box_r5 = new AdvancedModelRenderer(this);
        this.box_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legleft.addChild(box_r5);
        this.setRotateAngle(box_r5, -0.0873F, 0.1309F, 0.7418F);
        this.box_r5.cubeList.add(new ModelBox(box_r5, 36, 13, -0.5F, -1.0F, -1.5F, 5, 2, 3, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(2.5F, 2.0F, -0.5F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.1874F, -0.032F, 0.1477F);


        this.box_r6 = new AdvancedModelRenderer(this);
        this.box_r6.setRotationPoint(0.0F, 0.875F, -0.525F);
        this.legleft2.addChild(box_r6);
        this.setRotateAngle(box_r6, -0.1571F, 0.0F, 0.0F);
        this.box_r6.cubeList.add(new ModelBox(box_r6, 34, 62, -0.4F, -0.5F, -1.0F, 2, 4, 3, 0.0F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(-0.1717F, 3.3954F, 0.5987F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.1487F, -0.048F, 0.4369F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 18, 60, -1.3987F, 0.2F, -4.2F, 4, 1, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.0F;
        this.main.offsetX = -1.338F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.63F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 10, upperhead);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};

        EntityPrehistoricFloraEoherpeton entitySilesaurus = (EntityPrehistoricFloraEoherpeton) e;
        ((EntityPrehistoricFloraEoherpeton)e).tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEoherpeton ee = (EntityPrehistoricFloraEoherpeton) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } 

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEoherpeton entity = (EntityPrehistoricFloraEoherpeton) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 42.75 + (((tickAnim - 0) / 4) * (11.87661-(42.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (-5.9108-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (12.1188-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 11.87661 + (((tickAnim - 4) / 4) * (-7.76687-(11.87661)));
            yy = -5.9108 + (((tickAnim - 4) / 4) * (-10.6883-(-5.9108)));
            zz = 12.1188 + (((tickAnim - 4) / 4) * (6.5753-(12.1188)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -7.76687 + (((tickAnim - 8) / 5) * (-29.18495-(-7.76687)));
            yy = -10.6883 + (((tickAnim - 8) / 5) * (-14.9772-(-10.6883)));
            zz = 6.5753 + (((tickAnim - 8) / 5) * (-24.83-(6.5753)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -29.18495 + (((tickAnim - 13) / 17) * (42.75-(-29.18495)));
            yy = -14.9772 + (((tickAnim - 13) / 17) * (0-(-14.9772)));
            zz = -24.83 + (((tickAnim - 13) / 17) * (0-(-24.83)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (16.43896-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.48505-(0)));
            zz = 24.5 + (((tickAnim - 0) / 3) * (28.9635-(24.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 16.43896 + (((tickAnim - 3) / 3) * (2.37792-(16.43896)));
            yy = -0.48505 + (((tickAnim - 3) / 3) * (-0.97009-(-0.48505)));
            zz = 28.9635 + (((tickAnim - 3) / 3) * (33.427-(28.9635)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 2.37792 + (((tickAnim - 6) / 4) * (-30.12235-(2.37792)));
            yy = -0.97009 + (((tickAnim - 6) / 4) * (20.5285-(-0.97009)));
            zz = 33.427 + (((tickAnim - 6) / 4) * (15.0391-(33.427)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -30.12235 + (((tickAnim - 10) / 3) * (-19.25-(-30.12235)));
            yy = 20.5285 + (((tickAnim - 10) / 3) * (0-(20.5285)));
            zz = 15.0391 + (((tickAnim - 10) / 3) * (33-(15.0391)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -19.25 + (((tickAnim - 13) / 10) * (-9.07714-(-19.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (-9.2067-(0)));
            zz = 33 + (((tickAnim - 13) / 10) * (6.67627-(33)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -9.07714 + (((tickAnim - 23) / 7) * (0-(-9.07714)));
            yy = -9.2067 + (((tickAnim - 23) / 7) * (0-(-9.2067)));
            zz = 6.67627 + (((tickAnim - 23) / 7) * (24.5-(6.67627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 79.25 + (((tickAnim - 0) / 6) * (104.36983-(79.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.02413-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-1.98125-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 104.36983 + (((tickAnim - 6) / 7) * (47.91874-(104.36983)));
            yy = 1.02413 + (((tickAnim - 6) / 7) * (15.6698-(1.02413)));
            zz = -1.98125 + (((tickAnim - 6) / 7) * (13.3583-(-1.98125)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 47.91874 + (((tickAnim - 13) / 10) * (-2.85591-(47.91874)));
            yy = 15.6698 + (((tickAnim - 13) / 10) * (6.25721-(15.6698)));
            zz = 13.3583 + (((tickAnim - 13) / 10) * (10.7985-(13.3583)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -2.85591 + (((tickAnim - 23) / 7) * (79.25-(-2.85591)));
            yy = 6.25721 + (((tickAnim - 23) / 7) * (0-(6.25721)));
            zz = 10.7985 + (((tickAnim - 23) / 7) * (0-(10.7985)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = -1.025 + (((tickAnim - 0) / 6) * (-1.11-(-1.025)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = -1.11 + (((tickAnim - 6) / 7) * (0-(-1.11)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.97-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.28-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.97 + (((tickAnim - 18) / 5) * (0.425-(0.97)));
            zz = -0.28 + (((tickAnim - 18) / 5) * (-0.51-(-0.28)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.425 + (((tickAnim - 23) / 7) * (0-(0.425)));
            zz = -0.51 + (((tickAnim - 23) / 7) * (-1.025-(-0.51)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -29.18495 + (((tickAnim - 0) / 18) * (42.75-(-29.18495)));
            yy = 14.97723 + (((tickAnim - 0) / 18) * (0-(14.97723)));
            zz = 24.83 + (((tickAnim - 0) / 18) * (0-(24.83)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 42.75 + (((tickAnim - 18) / 5) * (2.15161-(42.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (9.86082-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-17.59376-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.15161 + (((tickAnim - 23) / 2) * (-7.76687-(2.15161)));
            yy = 9.86082 + (((tickAnim - 23) / 2) * (10.68827-(9.86082)));
            zz = -17.59376 + (((tickAnim - 23) / 2) * (-10.52529-(-17.59376)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -7.76687 + (((tickAnim - 25) / 5) * (-29.18495-(-7.76687)));
            yy = 10.68827 + (((tickAnim - 25) / 5) * (14.97723-(10.68827)));
            zz = -10.52529 + (((tickAnim - 25) / 5) * (24.83-(-10.52529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -19.25 + (((tickAnim - 0) / 18) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = -33 + (((tickAnim - 0) / 18) * (-24.5-(-33)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (16.43896-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.48505-(0)));
            zz = -24.5 + (((tickAnim - 18) / 2) * (-28.96352-(-24.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 16.43896 + (((tickAnim - 20) / 3) * (2.37792-(16.43896)));
            yy = -0.48505 + (((tickAnim - 20) / 3) * (-0.97009-(-0.48505)));
            zz = -28.96352 + (((tickAnim - 20) / 3) * (-33.42704-(-28.96352)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 2.37792 + (((tickAnim - 23) / 4) * (-30.12235-(2.37792)));
            yy = -0.97009 + (((tickAnim - 23) / 4) * (-20.52849-(-0.97009)));
            zz = -33.42704 + (((tickAnim - 23) / 4) * (-15.03914-(-33.42704)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -30.12235 + (((tickAnim - 27) / 3) * (-19.25-(-30.12235)));
            yy = -20.52849 + (((tickAnim - 27) / 3) * (0-(-20.52849)));
            zz = -15.03914 + (((tickAnim - 27) / 3) * (-33-(-15.03914)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 47.91874 + (((tickAnim - 0) / 8) * (5.40638-(47.91874)));
            yy = -15.66984 + (((tickAnim - 0) / 8) * (-13.92582-(-15.66984)));
            zz = -13.35833 + (((tickAnim - 0) / 8) * (8.24874-(-13.35833)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 5.40638 + (((tickAnim - 8) / 10) * (79.25-(5.40638)));
            yy = -13.92582 + (((tickAnim - 8) / 10) * (0-(-13.92582)));
            zz = 8.24874 + (((tickAnim - 8) / 10) * (0-(8.24874)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 79.25 + (((tickAnim - 18) / 5) * (104.36983-(79.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (1.02413-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-1.98125-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 104.36983 + (((tickAnim - 23) / 7) * (47.91874-(104.36983)));
            yy = 1.02413 + (((tickAnim - 23) / 7) * (-15.66984-(1.02413)));
            zz = -1.98125 + (((tickAnim - 23) / 7) * (-13.35833-(-1.98125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.665-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.22-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.665 + (((tickAnim - 3) / 5) * (0.175-(0.665)));
            zz = -0.22 + (((tickAnim - 3) / 5) * (-0.49-(-0.22)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.175 + (((tickAnim - 8) / 10) * (0-(0.175)));
            zz = -0.49 + (((tickAnim - 8) / 10) * (-1.025-(-0.49)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = -1.025 + (((tickAnim - 18) / 5) * (-1.11-(-1.025)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -1.11 + (((tickAnim - 23) / 7) * (0-(-1.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -26.39987 + (((tickAnim - 0) / 15) * (59.86412-(-26.39987)));
            yy = -23.97925 + (((tickAnim - 0) / 15) * (10.154-(-23.97925)));
            zz = -0.99025 + (((tickAnim - 0) / 15) * (7.6844-(-0.99025)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 59.86412 + (((tickAnim - 15) / 8) * (10.42001-(59.86412)));
            yy = 10.154 + (((tickAnim - 15) / 8) * (-12.19082-(10.154)));
            zz = 7.6844 + (((tickAnim - 15) / 8) * (22.42198-(7.6844)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 10.42001 + (((tickAnim - 23) / 7) * (-26.39987-(10.42001)));
            yy = -12.19082 + (((tickAnim - 23) / 7) * (-23.97925-(-12.19082)));
            zz = 22.42198 + (((tickAnim - 23) / 7) * (-0.99025-(22.42198)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -14.42468 + (((tickAnim - 0) / 8) * (-8.70154-(-14.42468)));
            yy = 33.49163 + (((tickAnim - 0) / 8) * (17.73922-(33.49163)));
            zz = -0.31877 + (((tickAnim - 0) / 8) * (-22.46436-(-0.31877)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.70154 + (((tickAnim - 8) / 7) * (9.75-(-8.70154)));
            yy = 17.73922 + (((tickAnim - 8) / 7) * (0-(17.73922)));
            zz = -22.46436 + (((tickAnim - 8) / 7) * (0-(-22.46436)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 9.75 + (((tickAnim - 15) / 4) * (12.16439-(9.75)));
            yy = 0 + (((tickAnim - 15) / 4) * (5.42597-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (8.5838-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 12.16439 + (((tickAnim - 19) / 4) * (4.98905-(12.16439)));
            yy = 5.42597 + (((tickAnim - 19) / 4) * (13.43917-(5.42597)));
            zz = 8.5838 + (((tickAnim - 19) / 4) * (14.17657-(8.5838)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 4.98905 + (((tickAnim - 23) / 3) * (-7.40045-(4.98905)));
            yy = 13.43917 + (((tickAnim - 23) / 3) * (42.93099-(13.43917)));
            zz = 14.17657 + (((tickAnim - 23) / 3) * (19.71238-(14.17657)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -7.40045 + (((tickAnim - 26) / 4) * (-14.42468-(-7.40045)));
            yy = 42.93099 + (((tickAnim - 26) / 4) * (33.49163-(42.93099)));
            zz = 19.71238 + (((tickAnim - 26) / 4) * (-0.31877-(19.71238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 33.24402 + (((tickAnim - 0) / 8) * (-7.3461-(33.24402)));
            yy = -2.61133 + (((tickAnim - 0) / 8) * (-9.96826-(-2.61133)));
            zz = 9.65694 + (((tickAnim - 0) / 8) * (13.25189-(9.65694)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -7.3461 + (((tickAnim - 8) / 7) * (51.94196-(-7.3461)));
            yy = -9.96826 + (((tickAnim - 8) / 7) * (-14.66333-(-9.96826)));
            zz = 13.25189 + (((tickAnim - 8) / 7) * (-0.50507-(13.25189)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 51.94196 + (((tickAnim - 15) / 4) * (87.70585-(51.94196)));
            yy = -14.66333 + (((tickAnim - 15) / 4) * (-11.44946-(-14.66333)));
            zz = -0.50507 + (((tickAnim - 15) / 4) * (2.2048-(-0.50507)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 87.70585 + (((tickAnim - 19) / 4) * (115.90155-(87.70585)));
            yy = -11.44946 + (((tickAnim - 19) / 4) * (-8.2356-(-11.44946)));
            zz = 2.2048 + (((tickAnim - 19) / 4) * (4.91467-(2.2048)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 115.90155 + (((tickAnim - 23) / 7) * (33.24402-(115.90155)));
            yy = -8.2356 + (((tickAnim - 23) / 7) * (-2.61133-(-8.2356)));
            zz = 4.91467 + (((tickAnim - 23) / 7) * (9.65694-(4.91467)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 8) * (-0.135-(0.35)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.48-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.135 + (((tickAnim - 8) / 7) * (0.8-(-0.135)));
            zz = -0.48 + (((tickAnim - 8) / 7) * (-0.9-(-0.48)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0.8 + (((tickAnim - 15) / 8) * (0.56-(0.8)));
            zz = -0.9 + (((tickAnim - 15) / 8) * (-1.82-(-0.9)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (-0.425-(0)));
            yy = 0.56 + (((tickAnim - 23) / 3) * (0.47-(0.56)));
            zz = -1.82 + (((tickAnim - 23) / 3) * (-1.94-(-1.82)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -0.425 + (((tickAnim - 26) / 4) * (0-(-0.425)));
            yy = 0.47 + (((tickAnim - 26) / 4) * (0.35-(0.47)));
            zz = -1.94 + (((tickAnim - 26) / 4) * (0-(-1.94)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 59.86412 + (((tickAnim - 0) / 6) * (4.96622-(59.86412)));
            yy = -10.15396 + (((tickAnim - 0) / 6) * (3.5275-(-10.15396)));
            zz = 7.6844 + (((tickAnim - 0) / 6) * (-19.25745-(7.6844)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 4.96622 + (((tickAnim - 6) / 7) * (-26.39987-(4.96622)));
            yy = 3.5275 + (((tickAnim - 6) / 7) * (23.9793-(3.5275)));
            zz = -19.25745 + (((tickAnim - 6) / 7) * (-0.99025-(-19.25745)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -26.39987 + (((tickAnim - 13) / 17) * (59.86412-(-26.39987)));
            yy = 23.9793 + (((tickAnim - 13) / 17) * (-10.15396-(23.9793)));
            zz = -0.99025 + (((tickAnim - 13) / 17) * (7.6844-(-0.99025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.75 + (((tickAnim - 0) / 3) * (13.00025-(9.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4.40016-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-11.85482-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 13.00025 + (((tickAnim - 3) / 3) * (5.84837-(13.00025)));
            yy = -4.40016 + (((tickAnim - 3) / 3) * (-9.42857-(-4.40016)));
            zz = -11.85482 + (((tickAnim - 3) / 3) * (-19.7171-(-11.85482)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 5.84837 + (((tickAnim - 6) / 4) * (-35.1035-(5.84837)));
            yy = -9.42857 + (((tickAnim - 6) / 4) * (-30.92267-(-9.42857)));
            zz = -19.7171 + (((tickAnim - 6) / 4) * (7.85123-(-19.7171)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -35.1035 + (((tickAnim - 10) / 3) * (-14.42468-(-35.1035)));
            yy = -30.92267 + (((tickAnim - 10) / 3) * (-33.4916-(-30.92267)));
            zz = 7.85123 + (((tickAnim - 10) / 3) * (-0.31877-(7.85123)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -14.42468 + (((tickAnim - 13) / 17) * (9.75-(-14.42468)));
            yy = -33.4916 + (((tickAnim - 13) / 17) * (0-(-33.4916)));
            zz = -0.31877 + (((tickAnim - 13) / 17) * (0-(-0.31877)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 51.94196 + (((tickAnim - 0) / 3) * (100.50205-(51.94196)));
            yy = -14.66333 + (((tickAnim - 0) / 3) * (-11.8821-(-14.66333)));
            zz = -0.50507 + (((tickAnim - 0) / 3) * (-2.61703-(-0.50507)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 100.50205 + (((tickAnim - 3) / 4) * (107.56214-(100.50205)));
            yy = -11.8821 + (((tickAnim - 3) / 4) * (-9.10087-(-11.8821)));
            zz = -2.61703 + (((tickAnim - 3) / 4) * (-4.72899-(-2.61703)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 107.56214 + (((tickAnim - 7) / 3) * (53.59464-(107.56214)));
            yy = -9.10087 + (((tickAnim - 7) / 3) * (-5.39256-(-9.10087)));
            zz = -4.72899 + (((tickAnim - 7) / 3) * (-7.54494-(-4.72899)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 53.59464 + (((tickAnim - 10) / 3) * (33.24402-(53.59464)));
            yy = -5.39256 + (((tickAnim - 10) / 3) * (-2.61133-(-5.39256)));
            zz = -7.54494 + (((tickAnim - 10) / 3) * (-9.6569-(-7.54494)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 33.24402 + (((tickAnim - 13) / 8) * (1.40014-(33.24402)));
            yy = -2.61133 + (((tickAnim - 13) / 8) * (7.35314-(-2.61133)));
            zz = -9.6569 + (((tickAnim - 13) / 8) * (3.10292-(-9.6569)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 1.40014 + (((tickAnim - 21) / 9) * (51.94196-(1.40014)));
            yy = 7.35314 + (((tickAnim - 21) / 9) * (-14.66333-(7.35314)));
            zz = 3.10292 + (((tickAnim - 21) / 9) * (-0.50507-(3.10292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.23-(0)));
            yy = 0.8 + (((tickAnim - 0) / 3) * (0.72-(0.8)));
            zz = -0.9 + (((tickAnim - 0) / 3) * (-1.86-(-0.9)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.23 + (((tickAnim - 3) / 4) * (0.45-(0.23)));
            yy = 0.72 + (((tickAnim - 3) / 4) * (0.64-(0.72)));
            zz = -1.86 + (((tickAnim - 3) / 4) * (-1.73-(-1.86)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0.45 + (((tickAnim - 7) / 6) * (0-(0.45)));
            yy = 0.64 + (((tickAnim - 7) / 6) * (0.35-(0.64)));
            zz = -1.73 + (((tickAnim - 7) / 6) * (0-(-1.73)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.35 + (((tickAnim - 13) / 8) * (0.66-(0.35)));
            zz = 0 + (((tickAnim - 13) / 8) * (-0.42-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0.66 + (((tickAnim - 21) / 9) * (0.8-(0.66)));
            zz = -0.42 + (((tickAnim - 21) / 9) * (-0.9-(-0.42)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375))*-2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-50))*-10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(2.25), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-500))*-10), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375))*-1.5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));
        this.throat.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375))*0.1),(float)1);


        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375+15))*1.2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-40))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-80))*2));

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-50))*0.15 + (((tickAnim - 0) / 11) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-100))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-50))*0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35 + (((tickAnim - 0) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-100))*0.1 + (((tickAnim - 11) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-50))*0.15-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-100))*0.1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35 + (((tickAnim - 11) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-50))*0.15 + (((tickAnim - 17) / 9) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-80))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-50))*0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35 + (((tickAnim - 17) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-80))*0.1 + (((tickAnim - 26) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-50))*0.15-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375-80))*0.1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35 + (((tickAnim - 26) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.375))*0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);



        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0), bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-130))*-4), bodyfront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-100))*-2), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperhead, upperhead.rotateAngleX + (float) Math.toRadians(0), upperhead.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-190))*2), upperhead.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyback, bodyback.rotateAngleX + (float) Math.toRadians(0), bodyback.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75-80))*4), bodyback.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEoherpeton entity = (EntityPrehistoricFloraEoherpeton) entitylivingbaseIn;
        int animCycle = 23;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308-50))*8), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308))*-2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308))*1.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0), bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308-100))*-8), bodyfront.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(73.11247), armright.rotateAngleY + (float) Math.toRadians(1.2744+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308-50))*5), armright.rotateAngleZ + (float) Math.toRadians(-48.0295));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(-28), armright2.rotateAngleY + (float) Math.toRadians(83.75), armright2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(89.75), armright3.rotateAngleY + (float) Math.toRadians(0), armright3.rotateAngleZ + (float) Math.toRadians(0));
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(0);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(0);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(-1.025);
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(73.11247), armleft.rotateAngleY + (float) Math.toRadians(-1.2744+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308-50))*5), armleft.rotateAngleZ + (float) Math.toRadians(48.02949));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(-28), armleft2.rotateAngleY + (float) Math.toRadians(-83.75), armleft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(89.75), armleft3.rotateAngleY + (float) Math.toRadians(0), armleft3.rotateAngleZ + (float) Math.toRadians(0));
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(0);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(0);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(-1.025);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308-150))*5), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperhead, upperhead.rotateAngleX + (float) Math.toRadians(0), upperhead.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308-250))*8), upperhead.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(bodyback, bodyback.rotateAngleX + (float) Math.toRadians(0), bodyback.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308))*-8), bodyback.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308))*-10), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308+100))*20), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308+20))*25), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(65.5923), legright.rotateAngleY + (float) Math.toRadians(12.3712+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308-50))*-5), legright.rotateAngleZ + (float) Math.toRadians(-43.0395+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308))*-3));
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(10.5));
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(-102), legright3.rotateAngleY + (float) Math.toRadians(80.2504), legright3.rotateAngleZ + (float) Math.toRadians(180));
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(-1.5);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(0.625);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(-1.575);
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(65.5923), legleft.rotateAngleY + (float) Math.toRadians(-12.3712+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308-50))*-5), legleft.rotateAngleZ + (float) Math.toRadians(43.0395+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*308))*3));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(-10.5));
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(-102), legleft3.rotateAngleY + (float) Math.toRadians(-80.2504), legleft3.rotateAngleZ + (float) Math.toRadians(-180));
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(1.5);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(0.625);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(-1.575);


    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEoherpeton entity = (EntityPrehistoricFloraEoherpeton) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-50))*15), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507))*-5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507))*3);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0), bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-100))*-15), bodyfront.rotateAngleZ + (float) Math.toRadians(0));
        this.bodyfront.rotationPointX = this.bodyfront.rotationPointX + (float)(0);
        this.bodyfront.rotationPointY = this.bodyfront.rotationPointY - (float)(0);
        this.bodyfront.rotationPointZ = this.bodyfront.rotationPointZ + (float)(0.4);
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(73.11247), armright.rotateAngleY + (float) Math.toRadians(1.2744+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-50))*5), armright.rotateAngleZ + (float) Math.toRadians(-48.0295));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(-28), armright2.rotateAngleY + (float) Math.toRadians(83.75), armright2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(89.75), armright3.rotateAngleY + (float) Math.toRadians(0), armright3.rotateAngleZ + (float) Math.toRadians(0));
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(0);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(0);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(-1.025);
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(73.11247), armleft.rotateAngleY + (float) Math.toRadians(-1.2744+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-50))*5), armleft.rotateAngleZ + (float) Math.toRadians(48.02949));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(-28), armleft2.rotateAngleY + (float) Math.toRadians(-83.75), armleft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(89.75), armleft3.rotateAngleY + (float) Math.toRadians(0), armleft3.rotateAngleZ + (float) Math.toRadians(0));
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(0);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(0);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(-1.025);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-150))*15), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperhead, upperhead.rotateAngleX + (float) Math.toRadians(0), upperhead.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-250))*15), upperhead.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(bodyback, bodyback.rotateAngleX + (float) Math.toRadians(0), bodyback.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507))*-15), bodyback.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507))*-15), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507+80))*35), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507+20))*45), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(65.5923), legright.rotateAngleY + (float) Math.toRadians(12.3712+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-50))*-5), legright.rotateAngleZ + (float) Math.toRadians(-43.0395+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507))*-3));
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(10.5));
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(-102), legright3.rotateAngleY + (float) Math.toRadians(80.2504), legright3.rotateAngleZ + (float) Math.toRadians(180));
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(-1.5);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(0.625);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(-1.575);
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(65.5923), legleft.rotateAngleY + (float) Math.toRadians(-12.3712+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-50))*-5), legleft.rotateAngleZ + (float) Math.toRadians(43.0395+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507))*3));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(-10.5));
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(-102), legleft3.rotateAngleY + (float) Math.toRadians(-80.2504), legleft3.rotateAngleZ + (float) Math.toRadians(-180));
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(1.5);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(0.625);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(-1.575);


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEoherpeton entity = (EntityPrehistoricFloraEoherpeton) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.74428-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.29361-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.23077-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 4.74428 + (((tickAnim - 3) / 3) * (-10.50572-(4.74428)));
            yy = -0.29361 + (((tickAnim - 3) / 3) * (-0.29361-(-0.29361)));
            zz = 2.23077 + (((tickAnim - 3) / 3) * (2.23077-(2.23077)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -10.50572 + (((tickAnim - 6) / 4) * (0-(-10.50572)));
            yy = -0.29361 + (((tickAnim - 6) / 4) * (0-(-0.29361)));
            zz = 2.23077 + (((tickAnim - 6) / 4) * (0-(2.23077)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -13.5 + (((tickAnim - 3) / 3) * (-8.25-(-13.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -8.25 + (((tickAnim - 6) / 4) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperhead, upperhead.rotateAngleX + (float) Math.toRadians(xx), upperhead.rotateAngleY + (float) Math.toRadians(yy), upperhead.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 14.75 + (((tickAnim - 3) / 3) * (27.25-(14.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 27.25 + (((tickAnim - 6) / 2) * (0-(27.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEoherpeton e = (EntityPrehistoricFloraEoherpeton) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.upperhead, 0,0,-0.2F);
        animator.rotate(this.upperhead, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
