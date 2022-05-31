package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelShonisaurus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer tailbase1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body1_r1;
    private final AdvancedModelRenderer neck1;
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
    private final AdvancedModelRenderer belly1;
    private final AdvancedModelRenderer belly4;
    private final AdvancedModelRenderer belly3;
    private final AdvancedModelRenderer flipper1;
    private final AdvancedModelRenderer flipperfingers1;
    private final AdvancedModelRenderer sadfin1;
    private final AdvancedModelRenderer sadfin2;
    private final AdvancedModelRenderer belly5;
    private final AdvancedModelRenderer belly6;
    private final AdvancedModelRenderer belly7;
    private final AdvancedModelRenderer belly8;
    private final AdvancedModelRenderer belly2;
    private final AdvancedModelRenderer belly9;
    private final AdvancedModelRenderer belly3_r1;
    private final AdvancedModelRenderer totail;
    private final AdvancedModelRenderer rearflipper1;
    private final AdvancedModelRenderer rearflipperfingers1;
    private final AdvancedModelRenderer belly11;
    private final AdvancedModelRenderer belly10;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail1_r1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer fluke3;
    private final AdvancedModelRenderer fluke4;
    private final AdvancedModelRenderer undertail1;
    private final AdvancedModelRenderer fin1;

    private ModelAnimator animator;

    public ModelShonisaurus() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.setRotateAngle(root, -0.0436F, 0.0F, 0.0F);


        this.tailbase1 = new AdvancedModelRenderer(this);
        this.tailbase1.setRotationPoint(0.0F, -0.1F, 35.0F);
        this.root.addChild(tailbase1);
        this.tailbase1.cubeList.add(new ModelBox(tailbase1, 60, 67, -9.5F, -6.5F, -22.0F, 19, 17, 14, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.6F, -20.3F);
        this.tailbase1.addChild(body1);
        this.setRotateAngle(body1, 0.1154F, 0.0F, 0.0F);


        this.body1_r1 = new AdvancedModelRenderer(this);
        this.body1_r1.setRotationPoint(0.0F, 23.5F, -14.7F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, -0.0436F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 0, 0, -12.0F, -32.0F, -28.3F, 24, 21, 42, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -4.1F, -38.3F);
        this.body1.addChild(neck1);
        this.setRotateAngle(neck1, 0.0456F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 124, 106, -5.5F, -6.0F, -14.0F, 11, 12, 4, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 124, 106, -8.0F, -6.0F, -10.0F, 16, 12, 10, 0.0F, false));

        this.head1 = new AdvancedModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -2.6F, -13.7F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, -0.0456F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 0, 0, -2.5F, -2.0F, -8.0F, 5, 4, 10, 0.0F, false));

        this.rostrum1 = new AdvancedModelRenderer(this);
        this.rostrum1.setRotationPoint(0.0F, 0.5F, -9.2F);
        this.head1.addChild(rostrum1);
        this.rostrum1.cubeList.add(new ModelBox(rostrum1, 158, 0, -2.0F, -1.5F, -8.0F, 4, 3, 10, 0.0F, false));

        this.rostrum2 = new AdvancedModelRenderer(this);
        this.rostrum2.setRotationPoint(0.0F, 0.5F, -7.8F);
        this.rostrum1.addChild(rostrum2);
        this.rostrum2.cubeList.add(new ModelBox(rostrum2, 134, 0, -1.5F, -1.0F, -18.0F, 3, 2, 18, 0.0F, false));

        this.teeth2 = new AdvancedModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 1.0F, 0.3F);
        this.rostrum2.addChild(teeth2);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 155, 132, -1.0F, 0.0F, -18.0F, 2, 1, 18, 0.0F, false));

        this.beak1 = new AdvancedModelRenderer(this);
        this.beak1.setRotationPoint(0.0F, -0.9F, 1.7F);
        this.rostrum1.addChild(beak1);
        this.setRotateAngle(beak1, 0.0422F, 0.0F, 0.0F);
        this.beak1.cubeList.add(new ModelBox(beak1, 93, 114, -1.0F, -1.0F, -27.0F, 2, 1, 27, 0.0F, false));

        this.teeth1 = new AdvancedModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 0.7F, 1.2F);
        this.rostrum1.addChild(teeth1);
        this.setRotateAngle(teeth1, 0.0911F, 0.0F, 0.0F);
        this.teeth1.cubeList.add(new ModelBox(teeth1, 165, 80, -1.5F, 0.0F, -9.0F, 3, 1, 9, 0.0F, false));

        this.jaw1 = new AdvancedModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 3.5F, 0.1F);
        this.head1.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 120, 80, -2.5F, -1.51F, -8.0F, 5, 3, 10, 0.0F, false));

        this.lowerrostrum1 = new AdvancedModelRenderer(this);
        this.lowerrostrum1.setRotationPoint(0.0F, 0.0F, -9.2F);
        this.jaw1.addChild(lowerrostrum1);
        this.lowerrostrum1.cubeList.add(new ModelBox(lowerrostrum1, 144, 160, -2.0F, -1.5F, -8.0F, 4, 2, 10, 0.0F, false));

        this.lowerrostrum2 = new AdvancedModelRenderer(this);
        this.lowerrostrum2.setRotationPoint(0.0F, 0.1F, -8.0F);
        this.lowerrostrum1.addChild(lowerrostrum2);
        this.lowerrostrum2.cubeList.add(new ModelBox(lowerrostrum2, 140, 20, -1.5F, -1.6F, -18.0F, 3, 1, 18, 0.0F, false));

        this.teeth4 = new AdvancedModelRenderer(this);
        this.teeth4.setRotationPoint(0.0F, -1.4F, 0.3F);
        this.lowerrostrum2.addChild(teeth4);
        this.teeth4.cubeList.add(new ModelBox(teeth4, 22, 152, -1.0F, -1.0F, -18.0F, 2, 1, 18, 0.0F, false));

        this.lowerbeak2 = new AdvancedModelRenderer(this);
        this.lowerbeak2.setRotationPoint(0.0F, 0.5F, -7.3F);
        this.lowerrostrum1.addChild(lowerbeak2);
        this.setRotateAngle(lowerbeak2, -0.0543F, 0.0F, 0.0F);
        this.lowerbeak2.cubeList.add(new ModelBox(lowerbeak2, 0, 147, -1.0F, -1.0F, -18.0F, 2, 1, 18, 0.0F, false));

        this.beak3 = new AdvancedModelRenderer(this);
        this.beak3.setRotationPoint(0.0F, 0.9F, 0.0F);
        this.lowerrostrum1.addChild(beak3);
        this.setRotateAngle(beak3, -0.1367F, 0.0F, 0.0F);
        this.beak3.cubeList.add(new ModelBox(beak3, 161, 56, -1.5F, -0.5F, -8.0F, 3, 1, 10, 0.0F, false));

        this.teeth3 = new AdvancedModelRenderer(this);
        this.teeth3.setRotationPoint(0.0F, -0.8F, 1.2F);
        this.lowerrostrum1.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.0456F, 0.0F, 0.0F);
        this.teeth3.cubeList.add(new ModelBox(teeth3, 127, 142, -1.5F, -1.0F, -9.0F, 3, 1, 9, 0.0F, false));

        this.gums1 = new AdvancedModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.5F, -3.6F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.3187F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 164, 106, -2.0F, -5.0F, -3.5F, 4, 5, 7, 0.0F, false));

        this.dewlap1 = new AdvancedModelRenderer(this);
        this.dewlap1.setRotationPoint(0.1F, 4.6F, 0.0F);
        this.jaw1.addChild(dewlap1);
        this.setRotateAngle(dewlap1, -0.6829F, 0.0F, 0.0F);
        this.dewlap1.cubeList.add(new ModelBox(dewlap1, 164, 20, -2.1F, -2.5F, -8.0F, 4, 5, 8, -0.01F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -2.2F, -0.2F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.3187F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 20, 0, -2.0F, -1.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.belly1 = new AdvancedModelRenderer(this);
        this.belly1.setRotationPoint(0.0F, 13.0F, 7.25F);
        this.neck1.addChild(belly1);
        this.setRotateAngle(belly1, -0.5103F, 0.0F, 0.0F);
        this.belly1.cubeList.add(new ModelBox(belly1, 120, 46, -4.0F, 1.0F, -23.0F, 8, 6, 5, 0.0F, false));

        this.belly4 = new AdvancedModelRenderer(this);
        this.belly4.setRotationPoint(0.0F, -12.25F, 8.25F);
        this.neck1.addChild(belly4);
        this.setRotateAngle(belly4, 0.0873F, 0.0F, 0.0F);
        this.belly4.cubeList.add(new ModelBox(belly4, 120, 46, -4.5F, 3.5F, -23.0F, 9, 3, 5, 0.0F, false));
        this.belly4.cubeList.add(new ModelBox(belly4, 120, 46, -6.5F, 3.5F, -18.0F, 13, 3, 10, 0.0F, false));

        this.belly3 = new AdvancedModelRenderer(this);
        this.belly3.setRotationPoint(0.0F, 13.5F, 14.5F);
        this.neck1.addChild(belly3);
        this.setRotateAngle(belly3, -0.3358F, 0.0F, 0.0F);
        this.belly3.cubeList.add(new ModelBox(belly3, 120, 46, -6.5F, -3.5F, -26.0F, 13, 10, 11, 0.0F, false));

        this.flipper1 = new AdvancedModelRenderer(this);
        this.flipper1.setRotationPoint(12.1F, 7.1F, -35.6F);
        this.body1.addChild(flipper1);
        this.setRotateAngle(flipper1, 0.182F, 0.0911F, -0.2731F);
        this.flipper1.cubeList.add(new ModelBox(flipper1, 0, 123, -1.0F, 0.0F, -4.0F, 2, 12, 8, 0.0F, false));

        this.flipperfingers1 = new AdvancedModelRenderer(this);
        this.flipperfingers1.setRotationPoint(0.0F, 1.4F, -3.2F);
        this.flipper1.addChild(flipperfingers1);
        this.flipperfingers1.cubeList.add(new ModelBox(flipperfingers1, 82, 129, 0.0F, 0.0F, 0.0F, 0, 29, 13, 0.0F, false));

        this.sadfin1 = new AdvancedModelRenderer(this);
        this.sadfin1.setRotationPoint(0.0F, -11.5F, -9.4F);
        this.body1.addChild(sadfin1);
        this.setRotateAngle(sadfin1, -0.5918F, 0.0F, 0.0F);
        this.sadfin1.cubeList.add(new ModelBox(sadfin1, 163, 163, -1.0F, -5.0F, -3.0F, 2, 5, 9, 0.0F, false));

        this.sadfin2 = new AdvancedModelRenderer(this);
        this.sadfin2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.sadfin1.addChild(sadfin2);
        this.setRotateAngle(sadfin2, 0.1367F, 0.0F, 0.0F);
        this.sadfin2.cubeList.add(new ModelBox(sadfin2, 55, 73, 0.0F, -9.0F, -2.0F, 0, 9, 11, 0.0F, false));

        this.belly5 = new AdvancedModelRenderer(this);
        this.belly5.setRotationPoint(0.0F, 12.65F, -15.8F);
        this.body1.addChild(belly5);
        this.setRotateAngle(belly5, -0.2922F, 0.0F, 0.0F);
        this.belly5.cubeList.add(new ModelBox(belly5, 120, 46, -9.5F, 0.5F, -26.0F, 19, 6, 23, 0.0F, false));

        this.belly6 = new AdvancedModelRenderer(this);
        this.belly6.setRotationPoint(0.0F, 13.65F, 5.2F);
        this.body1.addChild(belly6);
        this.setRotateAngle(belly6, -0.0873F, 0.0F, 0.0F);
        this.belly6.cubeList.add(new ModelBox(belly6, 120, 46, -10.5F, -0.5F, -25.0F, 21, 7, 19, 0.0F, false));

        this.belly7 = new AdvancedModelRenderer(this);
        this.belly7.setRotationPoint(0.0F, -11.35F, 0.2F);
        this.body1.addChild(belly7);
        this.setRotateAngle(belly7, -0.0873F, 0.0F, 0.0F);
        this.belly7.cubeList.add(new ModelBox(belly7, 120, 46, -10.5F, -0.5F, -26.0F, 21, 7, 26, 0.0F, false));

        this.belly8 = new AdvancedModelRenderer(this);
        this.belly8.setRotationPoint(0.0F, -14.35F, -15.8F);
        this.body1.addChild(belly8);
        this.setRotateAngle(belly8, 0.0873F, 0.0F, 0.0F);
        this.belly8.cubeList.add(new ModelBox(belly8, 120, 46, -10.0F, -0.3F, -26.0F, 20, 7, 17, 0.0F, false));

        this.belly2 = new AdvancedModelRenderer(this);
        this.belly2.setRotationPoint(0.0F, 10.8F, -22.1F);
        this.tailbase1.addChild(belly2);
        this.setRotateAngle(belly2, 0.4098F, 0.0F, 0.0F);
        this.belly2.cubeList.add(new ModelBox(belly2, 0, 84, -7.0F, 0.0F, -1.0F, 14, 9, 14, 0.0F, false));

        this.belly9 = new AdvancedModelRenderer(this);
        this.belly9.setRotationPoint(0.0F, -11.2F, -22.1F);
        this.tailbase1.addChild(belly9);
        this.setRotateAngle(belly9, -0.0436F, 0.0F, 0.0F);


        this.belly3_r1 = new AdvancedModelRenderer(this);
        this.belly3_r1.setRotationPoint(0.0F, 13.3F, -12.9F);
        this.belly9.addChild(belly3_r1);
        this.setRotateAngle(belly3_r1, -0.0175F, 0.0F, 0.0F);
        this.belly3_r1.cubeList.add(new ModelBox(belly3_r1, 0, 84, -8.0F, -13.375F, 12.9F, 16, 6, 14, 0.0F, false));

        this.totail = new AdvancedModelRenderer(this);
        this.totail.setRotationPoint(0.0F, -0.9F, -6.0F);
        this.tailbase1.addChild(totail);
        this.totail.cubeList.add(new ModelBox(totail, 60, 67, -7.5F, -6.6F, -3.0F, 15, 13, 17, 0.0F, false));

        this.rearflipper1 = new AdvancedModelRenderer(this);
        this.rearflipper1.setRotationPoint(6.7F, 2.9F, 12.5F);
        this.totail.addChild(rearflipper1);
        this.setRotateAngle(rearflipper1, 0.8556F, 0.1745F, -0.1784F);
        this.rearflipper1.cubeList.add(new ModelBox(rearflipper1, 162, 40, -1.0F, 0.0F, -4.0F, 2, 9, 7, 0.0F, false));

        this.rearflipperfingers1 = new AdvancedModelRenderer(this);
        this.rearflipperfingers1.setRotationPoint(0.0F, 0.0F, -5.1F);
        this.rearflipper1.addChild(rearflipperfingers1);
        this.rearflipperfingers1.cubeList.add(new ModelBox(rearflipperfingers1, 0, 173, 0.0F, 1.0F, 0.0F, 0, 29, 13, 0.0F, false));

        this.belly11 = new AdvancedModelRenderer(this);
        this.belly11.setRotationPoint(0.0F, 5.7F, -4.1F);
        this.totail.addChild(belly11);
        this.setRotateAngle(belly11, 0.4098F, 0.0F, 0.0F);
        this.belly11.cubeList.add(new ModelBox(belly11, 0, 84, -6.0F, 1.0F, -1.0F, 12, 8, 18, 0.0F, false));

        this.belly10 = new AdvancedModelRenderer(this);
        this.belly10.setRotationPoint(0.0F, -9.3F, -2.1F);
        this.totail.addChild(belly10);
        this.setRotateAngle(belly10, -0.0436F, 0.0F, 0.0F);
        this.belly10.cubeList.add(new ModelBox(belly10, 0, 84, -6.0F, 0.0F, -1.0F, 12, 6, 17, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -3.7F, 14.1F);
        this.totail.addChild(tail1);
        this.setRotateAngle(tail1, -0.0873F, 0.0F, 0.0F);


        this.tail1_r1 = new AdvancedModelRenderer(this);
        this.tail1_r1.setRotationPoint(0.0F, 28.7F, -43.1F);
        this.tail1.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, 0.0873F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 95, 7, -5.5F, -29.2F, 44.1F, 11, 10, 17, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6F, 14.1F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0019F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 56, 106, -4.0F, -6.0F, 0.0F, 8, 9, 14, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -2.25F, 15.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0456F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 56, 106, -2.5F, -3.319F, -1.8934F, 5, 7, 13, 0.0F, false));

        this.fluke3 = new AdvancedModelRenderer(this);
        this.fluke3.setRotationPoint(0.0F, 1.781F, 8.6066F);
        this.tail3.addChild(fluke3);
        this.setRotateAngle(fluke3, -0.5463F, 0.0F, 0.0F);
        this.fluke3.cubeList.add(new ModelBox(fluke3, 130, 132, -1.0F, -4.5F, 0.0F, 2, 7, 21, 0.0F, false));

        this.fluke4 = new AdvancedModelRenderer(this);
        this.fluke4.setRotationPoint(0.0F, 4.2F, -2.0F);
        this.fluke3.addChild(fluke4);
        this.fluke4.cubeList.add(new ModelBox(fluke4, 0, 24, 0.0F, -19.2F, -2.0F, 0, 17, 43, 0.0F, false));

        this.undertail1 = new AdvancedModelRenderer(this);
        this.undertail1.setRotationPoint(0.0F, 8.55F, -4.1F);
        this.tail1.addChild(undertail1);
        this.setRotateAngle(undertail1, 0.2693F, 0.0F, 0.0F);
        this.undertail1.cubeList.add(new ModelBox(undertail1, 6, 129, -4.0F, -2.0F, 2.0F, 8, 4, 19, 0.0F, false));

        this.fin1 = new AdvancedModelRenderer(this);
        this.fin1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(fin1);
        this.fin1.cubeList.add(new ModelBox(fin1, 108, 145, -2.0F, 0.0F, 0.0F, 2, 11, 15, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5 * 1.80F);
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }



    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.root.offsetY = 0F;

        AdvancedModelRenderer[] fishTail = {this.tailbase1, this.tail1, this.tail2};

        float speed = 0.16F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
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
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.5F * still, -0.85, f2, 0.6F * still);
            this.swing(root, speed, 0.02F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(flipper1, (float) (speed * 0.65), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(flipper1, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        //this.flap(flipper2, (float) (speed * 0.65), -0.2F, false, 0.8F, 0, f2, 0.5F);
        //this.swing(flipper2, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(rearflipper1, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(rearflipper1, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        //this.flap(rearflipper2, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        //this.swing(rearflipper2, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = 0F;
            this.bob(root, -speed * 1.8F, 0.2F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.01F, -0.1, f2, 0.4F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.1F, -0.25, f2, 0.2F * still);
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

