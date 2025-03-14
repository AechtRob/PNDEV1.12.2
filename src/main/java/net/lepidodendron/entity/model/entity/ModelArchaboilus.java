package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaboilus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelArchaboilus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightlegs3;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftlegs3;
    private final AdvancedModelRenderer righthindwing;
    private final AdvancedModelRenderer lefthindwing;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightantennae;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftantennae;
    private final AdvancedModelRenderer cube_r7;

    public ModelArchaboilus() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.45F, 1.25F);
        this.main.cubeList.add(new ModelBox(main, 29, 9, -1.5F, -0.5F, -5.5F, 3, 2, 2, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -0.5F, -3.5F, 3, 2, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 23, -1.0F, -0.5F, 0.35F, 2, 2, 1, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 9, 12, -0.5F, 0.0F, 1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.5F, 4.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 0, 0.0F, -1.725F, -1.3F, 0, 1, 3, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.25F, 0.5F, -4.5F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0F, -0.6545F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 32, 0, -3.75F, 0.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.25F, 0.5F, -4.5F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.0F, 0.6545F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 32, 0, -0.25F, 0.0F, 0.0F, 4, 2, 0, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-1.5F, 0.5F, -3.95F);
        this.main.addChild(rightleg2);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 32, -3.5F, 0.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(1.5F, 0.5F, -3.95F);
        this.main.addChild(leftleg2);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 32, -0.5F, 0.0F, 0.0F, 4, 2, 0, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-1.5F, 0.5F, -3.3F);
        this.main.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.6545F, 1.0908F, 0.7854F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 15, 29, -4.0F, 0.0F, 0.0F, 4, 1, 0, 0.0F, false));

        this.rightlegs3 = new AdvancedModelRenderer(this);
        this.rightlegs3.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.rightleg3.addChild(rightlegs3);
        this.setRotateAngle(rightlegs3, 0.0F, 0.0F, -1.5272F);
        this.rightlegs3.cubeList.add(new ModelBox(rightlegs3, 0, 12, -4.0F, -1.0F, -0.01F, 4, 2, 0, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(1.5F, 0.5F, -3.3F);
        this.main.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.6545F, -1.0908F, -0.7854F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 15, 29, 0.0F, 0.0F, 0.0F, 4, 1, 0, 0.0F, true));

        this.leftlegs3 = new AdvancedModelRenderer(this);
        this.leftlegs3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leftleg3.addChild(leftlegs3);
        this.setRotateAngle(leftlegs3, 0.0F, 0.0F, 1.5272F);
        this.leftlegs3.cubeList.add(new ModelBox(leftlegs3, 0, 12, 0.0F, -1.0F, -0.01F, 4, 2, 0, 0.0F, true));

        this.righthindwing = new AdvancedModelRenderer(this);
        this.righthindwing.setRotationPoint(-1.5F, -0.55F, -4.0F);
        this.main.addChild(righthindwing);
        this.setRotateAngle(righthindwing, 0.0F, 0.0F, 0.0F);
        this.righthindwing.cubeList.add(new ModelBox(righthindwing, 0, 23, 0.0F, 0.0F, 0.0F, 3, 0, 8, 0.0F, false));

        this.lefthindwing = new AdvancedModelRenderer(this);
        this.lefthindwing.setRotationPoint(1.5F, -0.525F, -4.0F);
        this.main.addChild(lefthindwing);
        this.setRotateAngle(lefthindwing, 0.0F, 0.0F, 0.0F);
        this.lefthindwing.cubeList.add(new ModelBox(lefthindwing, 0, 23, -3.0F, 0.0F, 0.0F, 3, 0, 8, 0.0F, true));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(1.5F, -0.55F, -4.5F);
        this.main.addChild(rightwing);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 15, 23, -2.5F, -0.025F, 0.0F, 3, 0, 5, 0.0F, false));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-2.475F, 0.0F, 5.0F);
        this.rightwing.addChild(rightwing2);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 27, 23, 0.0F, -0.025F, 0.0F, 3, 0, 4, 0.0F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(-1.5F, -0.6F, -4.5F);
        this.main.addChild(leftwing);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 15, 23, -0.5F, -0.025F, 0.0F, 3, 0, 5, 0.0F, true));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(2.475F, 0.0F, 5.0F);
        this.leftwing.addChild(leftwing2);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 27, 23, -3.0F, -0.025F, 0.0F, 3, 0, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -5.5F);
        this.main.addChild(head);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 1.2607F, -0.9757F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.147F, 0.0735F, -0.4305F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.075F, -0.4576F, -0.7118F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.75F, -0.038F, -1.1405F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 0, -0.625F, -0.475F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 0, -1.875F, -0.475F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 1.2607F, -0.9757F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.147F, -0.0735F, 0.4305F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.075F, -0.4576F, -0.7118F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.875F, -0.425F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 29, -1.0F, 0.0F, -1.5F, 2, 2, 2, 0.0F, false));

        this.rightantennae = new AdvancedModelRenderer(this);
        this.rightantennae.setRotationPoint(-0.4F, -0.7507F, -1.5107F);
        this.head.addChild(rightantennae);
        this.setRotateAngle(rightantennae, 0.3765F, -0.0586F, -0.235F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.rightantennae.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -4.5F, -1.0F, 0, 6, 16, 0.0F, false));

        this.leftantennae = new AdvancedModelRenderer(this);
        this.leftantennae.setRotationPoint(0.4F, -0.7507F, -1.5107F);
        this.head.addChild(leftantennae);
        this.setRotateAngle(leftantennae, 0.3765F, 0.0586F, 0.235F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.leftantennae.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -4.5F, -1.0F, 0, 6, 16, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.main.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.0F, 0.8F, -0.5F);
        this.setRotateAngle(rightleg, 0.0F, -0.8F, 0.5F);
        this.setRotateAngle(leftantennae, 0.0F, 0.2F, 0.2F);
        this.setRotateAngle(rightantennae, 0.0F, -0.2F, -0.2F);
        this.setRotateAngle(lefthindwing, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(righthindwing, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(leftwing, 0.1F, -1.5F, 0.0F);
        this.setRotateAngle(rightwing, 0.1F, 1.5F, 0.0F);
        this.setRotateAngle(leftwing2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing2, 0.2F, 0.0F, 0.0F);
        this.main.offsetY = -0.21F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftantennae, 0.0F, 0.2F, 0.2F);
        this.setRotateAngle(rightantennae, 0.0F, -0.2F, -0.2F);
        this.setRotateAngle(lefthindwing, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(righthindwing, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing2, 0.0F, 0.0F, 0.0F);
        this.main.offsetY = 0.18F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        this.setRotateAngle(lefthindwing, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(righthindwing, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(leftwing, 0.0F, -0.6F, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, 0.6F, 0.0F);
        this.setRotateAngle(leftwing2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing2, 0.0F, 0.0F, 0.0F);
        this.main.offsetY = 0.15F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraArchaboilus ee = (EntityPrehistoricFloraArchaboilus) entitylivingbaseIn;


        if (ee.getIsFlying()) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaboilus entity = (EntityPrehistoricFloraArchaboilus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+150))*1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+60))*2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+60))*0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.00307 + (((tickAnim - 0) / 4) * (-18.55198-(2.00307)));
            yy = 22.6313 + (((tickAnim - 0) / 4) * (-0.02851-(22.6313)));
            zz = -7.7614 + (((tickAnim - 0) / 4) * (28.85183-(-7.7614)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -18.55198 + (((tickAnim - 4) / 4) * (6.88918-(-18.55198)));
            yy = -0.02851 + (((tickAnim - 4) / 4) * (-22.25913-(-0.02851)));
            zz = 28.85183 + (((tickAnim - 4) / 4) * (-7.96138-(28.85183)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.88918 + (((tickAnim - 8) / 2) * (7.06945-(6.88918)));
            yy = -22.25913 + (((tickAnim - 8) / 2) * (-7.08992-(-22.25913)));
            zz = -7.96138 + (((tickAnim - 8) / 2) * (-9.79283-(-7.96138)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 7.06945 + (((tickAnim - 10) / 3) * (1.33099-(7.06945)));
            yy = -7.08992 + (((tickAnim - 10) / 3) * (7.49454-(-7.08992)));
            zz = -9.79283 + (((tickAnim - 10) / 3) * (-3.21705-(-9.79283)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.33099 + (((tickAnim - 13) / 2) * (2.00307-(1.33099)));
            yy = 7.49454 + (((tickAnim - 13) / 2) * (22.6313-(7.49454)));
            zz = -3.21705 + (((tickAnim - 13) / 2) * (-7.7614-(-3.21705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.55758 + (((tickAnim - 0) / 1) * (4.11405-(1.55758)));
            yy = -17.67723 + (((tickAnim - 0) / 1) * (-22.13991-(-17.67723)));
            zz = -0.6584 + (((tickAnim - 0) / 1) * (-10.80524-(-0.6584)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 4.11405 + (((tickAnim - 1) / 2) * (3.82667-(4.11405)));
            yy = -22.13991 + (((tickAnim - 1) / 2) * (-12.08454-(-22.13991)));
            zz = -10.80524 + (((tickAnim - 1) / 2) * (-10.10697-(-10.80524)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.82667 + (((tickAnim - 3) / 2) * (1.77993-(3.82667)));
            yy = -12.08454 + (((tickAnim - 3) / 2) * (2.54007-(-12.08454)));
            zz = -10.10697 + (((tickAnim - 3) / 2) * (-1.40127-(-10.10697)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.77993 + (((tickAnim - 5) / 3) * (-0.41419-(1.77993)));
            yy = 2.54007 + (((tickAnim - 5) / 3) * (22.49639-(2.54007)));
            zz = -1.40127 + (((tickAnim - 5) / 3) * (-1.08237-(-1.40127)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.41419 + (((tickAnim - 8) / 5) * (-1.43681-(-0.41419)));
            yy = 22.49639 + (((tickAnim - 8) / 5) * (-3.46419-(22.49639)));
            zz = -1.08237 + (((tickAnim - 8) / 5) * (22.54345-(-1.08237)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1.43681 + (((tickAnim - 13) / 2) * (1.55758-(-1.43681)));
            yy = -3.46419 + (((tickAnim - 13) / 2) * (-17.67723-(-3.46419)));
            zz = 22.54345 + (((tickAnim - 13) / 2) * (-0.6584-(22.54345)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.58 + (((tickAnim - 0) / 2) * (0-(-2.58)));
            yy = -5.1 + (((tickAnim - 0) / 2) * (0-(-5.1)));
            zz = -0.51 + (((tickAnim - 0) / 2) * (0-(-0.51)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (6.21925-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (-23.72263-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (15.99929-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 6.21925 + (((tickAnim - 6) / 3) * (-11.59079-(6.21925)));
            yy = -23.72263 + (((tickAnim - 6) / 3) * (-22.95305-(-23.72263)));
            zz = 15.99929 + (((tickAnim - 6) / 3) * (-2.3105-(15.99929)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -11.59079 + (((tickAnim - 9) / 6) * (-2.58-(-11.59079)));
            yy = -22.95305 + (((tickAnim - 9) / 6) * (-5.1-(-22.95305)));
            zz = -2.3105 + (((tickAnim - 9) / 6) * (-0.51-(-2.3105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 0) / 2) * (0-(-10)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (-45-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = -45 + (((tickAnim - 9) / 6) * (-10-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlegs3, rightlegs3.rotateAngleX + (float) Math.toRadians(xx), rightlegs3.rotateAngleY + (float) Math.toRadians(yy), rightlegs3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -9.28 + (((tickAnim - 0) / 2) * (12.73916-(-9.28)));
            yy = 11.26 + (((tickAnim - 0) / 2) * (21.66159-(11.26)));
            zz = -14.43 + (((tickAnim - 0) / 2) * (14.75144-(-14.43)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 12.73916 + (((tickAnim - 2) / 3) * (2.33397-(12.73916)));
            yy = 21.66159 + (((tickAnim - 2) / 3) * (2.59128-(21.66159)));
            zz = 14.75144 + (((tickAnim - 2) / 3) * (3.74396-(14.75144)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2.33397 + (((tickAnim - 5) / 4) * (2.8612-(2.33397)));
            yy = 2.59128 + (((tickAnim - 5) / 4) * (-22.76926-(2.59128)));
            zz = 3.74396 + (((tickAnim - 5) / 4) * (11.11992-(3.74396)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 2.8612 + (((tickAnim - 9) / 4) * (-18.55198-(2.8612)));
            yy = -22.76926 + (((tickAnim - 9) / 4) * (0.0285-(-22.76926)));
            zz = 11.11992 + (((tickAnim - 9) / 4) * (-28.8518-(11.11992)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -18.55198 + (((tickAnim - 13) / 2) * (-9.28-(-18.55198)));
            yy = 0.0285 + (((tickAnim - 13) / 2) * (11.26-(0.0285)));
            zz = -28.8518 + (((tickAnim - 13) / 2) * (-14.43-(-28.8518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.13165 + (((tickAnim - 0) / 3) * (-0.41419-(-0.13165)));
            yy = -7.49885 + (((tickAnim - 0) / 3) * (-22.49639-(-7.49885)));
            zz = 1.00863 + (((tickAnim - 0) / 3) * (1.08237-(1.00863)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.41419 + (((tickAnim - 3) / 4) * (-1.43681-(-0.41419)));
            yy = -22.49639 + (((tickAnim - 3) / 4) * (3.46419-(-22.49639)));
            zz = 1.08237 + (((tickAnim - 3) / 4) * (-22.54345-(1.08237)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.43681 + (((tickAnim - 7) / 3) * (4.11405-(-1.43681)));
            yy = 3.46419 + (((tickAnim - 7) / 3) * (22.13991-(3.46419)));
            zz = -22.54345 + (((tickAnim - 7) / 3) * (10.80524-(-22.54345)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.11405 + (((tickAnim - 10) / 3) * (1.47307-(4.11405)));
            yy = 22.13991 + (((tickAnim - 10) / 3) * (7.44149-(22.13991)));
            zz = 10.80524 + (((tickAnim - 10) / 3) * (1.87534-(10.80524)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.47307 + (((tickAnim - 13) / 2) * (-0.13165-(1.47307)));
            yy = 7.44149 + (((tickAnim - 13) / 2) * (-7.49885-(7.44149)));
            zz = 1.87534 + (((tickAnim - 13) / 2) * (1.00863-(1.87534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6.21925 + (((tickAnim - 0) / 3) * (-11.59079-(6.21925)));
            yy = 23.7226 + (((tickAnim - 0) / 3) * (22.953-(23.7226)));
            zz = -15.9993 + (((tickAnim - 0) / 3) * (2.3105-(-15.9993)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -11.59079 + (((tickAnim - 3) / 8) * (0-(-11.59079)));
            yy = 22.953 + (((tickAnim - 3) / 8) * (0-(22.953)));
            zz = 2.3105 + (((tickAnim - 3) / 8) * (0-(2.3105)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (6.21925-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (23.7226-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-15.9993-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 25 + (((tickAnim - 0) / 3) * (45-(25)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 45 + (((tickAnim - 3) / 8) * (0-(45)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlegs3, leftlegs3.rotateAngleX + (float) Math.toRadians(xx), leftlegs3.rotateAngleY + (float) Math.toRadians(yy), leftlegs3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightantennae, rightantennae.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+120))*5), rightantennae.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2.5), rightantennae.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+180))*2.5));


        this.setRotateAngle(leftantennae, leftantennae.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+60))*5), leftantennae.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+90))*2.5), leftantennae.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+120))*2.5));

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaboilus entity = (EntityPrehistoricFloraArchaboilus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-7.5), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*0.25);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(0), rightleg.rotateAngleY + (float) Math.toRadians(0), rightleg.rotateAngleZ + (float) Math.toRadians(67.5));


        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(0), leftleg.rotateAngleY + (float) Math.toRadians(0), leftleg.rotateAngleZ + (float) Math.toRadians(-67.5));


        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(-22.5), rightleg2.rotateAngleZ + (float) Math.toRadians(22.5));


        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(0), leftleg2.rotateAngleY + (float) Math.toRadians(22.5), leftleg2.rotateAngleZ + (float) Math.toRadians(-22.5));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(0), rightleg3.rotateAngleY + (float) Math.toRadians(0), rightleg3.rotateAngleZ + (float) Math.toRadians(-22.5));


        this.setRotateAngle(rightlegs3, rightlegs3.rotateAngleX + (float) Math.toRadians(0), rightlegs3.rotateAngleY + (float) Math.toRadians(0), rightlegs3.rotateAngleZ + (float) Math.toRadians(45));


        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(0), leftleg3.rotateAngleY + (float) Math.toRadians(0), leftleg3.rotateAngleZ + (float) Math.toRadians(22.5));


        this.setRotateAngle(leftlegs3, leftlegs3.rotateAngleX + (float) Math.toRadians(0), leftlegs3.rotateAngleY + (float) Math.toRadians(0), leftlegs3.rotateAngleZ + (float) Math.toRadians(-45));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -35.74606 + (((tickAnim - 0) / 1) * (44.73173-(-35.74606)));
            yy = -68.65726 + (((tickAnim - 0) / 1) * (-46.72126-(-68.65726)));
            zz = 78.34573 + (((tickAnim - 0) / 1) * (-49.27609-(78.34573)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 44.73173 + (((tickAnim - 1) / 1) * (19.59563-(44.73173)));
            yy = -46.72126 + (((tickAnim - 1) / 1) * (-44.17436-(-46.72126)));
            zz = -49.27609 + (((tickAnim - 1) / 1) * (-63.08167-(-49.27609)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 19.59563 + (((tickAnim - 2) / 1) * (-79.04924-(19.59563)));
            yy = -44.17436 + (((tickAnim - 2) / 1) * (-71.53904-(-44.17436)));
            zz = -63.08167 + (((tickAnim - 2) / 1) * (52.25354-(-63.08167)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -79.04924 + (((tickAnim - 3) / 0) * (-35.74606-(-79.04924)));
            yy = -71.53904 + (((tickAnim - 3) / 0) * (-68.65726-(-71.53904)));
            zz = 52.25354 + (((tickAnim - 3) / 0) * (78.34573-(52.25354)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -35.74606 + (((tickAnim - 3) / 1) * (44.73173-(-35.74606)));
            yy = -68.65726 + (((tickAnim - 3) / 1) * (-46.72126-(-68.65726)));
            zz = 78.34573 + (((tickAnim - 3) / 1) * (-49.27609-(78.34573)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 44.73173 + (((tickAnim - 4) / 1) * (19.59563-(44.73173)));
            yy = -46.72126 + (((tickAnim - 4) / 1) * (-44.17436-(-46.72126)));
            zz = -49.27609 + (((tickAnim - 4) / 1) * (-63.08167-(-49.27609)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 19.59563 + (((tickAnim - 5) / 1) * (-79.04924-(19.59563)));
            yy = -44.17436 + (((tickAnim - 5) / 1) * (-71.53904-(-44.17436)));
            zz = -63.08167 + (((tickAnim - 5) / 1) * (52.25354-(-63.08167)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -79.04924 + (((tickAnim - 6) / 1) * (-35.74606-(-79.04924)));
            yy = -71.53904 + (((tickAnim - 6) / 1) * (-68.65726-(-71.53904)));
            zz = 52.25354 + (((tickAnim - 6) / 1) * (78.34573-(52.25354)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -35.74606 + (((tickAnim - 7) / 1) * (44.73173-(-35.74606)));
            yy = -68.65726 + (((tickAnim - 7) / 1) * (-46.72126-(-68.65726)));
            zz = 78.34573 + (((tickAnim - 7) / 1) * (-49.27609-(78.34573)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 44.73173 + (((tickAnim - 8) / 0) * (19.59563-(44.73173)));
            yy = -46.72126 + (((tickAnim - 8) / 0) * (-44.17436-(-46.72126)));
            zz = -49.27609 + (((tickAnim - 8) / 0) * (-63.08167-(-49.27609)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 19.59563 + (((tickAnim - 8) / 1) * (-79.04924-(19.59563)));
            yy = -44.17436 + (((tickAnim - 8) / 1) * (-71.53904-(-44.17436)));
            zz = -63.08167 + (((tickAnim - 8) / 1) * (52.25354-(-63.08167)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -79.04924 + (((tickAnim - 9) / 1) * (-35.74606-(-79.04924)));
            yy = -71.53904 + (((tickAnim - 9) / 1) * (-68.65726-(-71.53904)));
            zz = 52.25354 + (((tickAnim - 9) / 1) * (78.34573-(52.25354)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -35.74606 + (((tickAnim - 10) / 1) * (44.73173-(-35.74606)));
            yy = -68.65726 + (((tickAnim - 10) / 1) * (-46.72126-(-68.65726)));
            zz = 78.34573 + (((tickAnim - 10) / 1) * (-49.27609-(78.34573)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 44.73173 + (((tickAnim - 11) / 1) * (19.59563-(44.73173)));
            yy = -46.72126 + (((tickAnim - 11) / 1) * (-44.17436-(-46.72126)));
            zz = -49.27609 + (((tickAnim - 11) / 1) * (-63.08167-(-49.27609)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 19.59563 + (((tickAnim - 12) / 1) * (-79.04924-(19.59563)));
            yy = -44.17436 + (((tickAnim - 12) / 1) * (-71.53904-(-44.17436)));
            zz = -63.08167 + (((tickAnim - 12) / 1) * (52.25354-(-63.08167)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -79.04924 + (((tickAnim - 13) / 0) * (-35.74606-(-79.04924)));
            yy = -71.53904 + (((tickAnim - 13) / 0) * (-68.65726-(-71.53904)));
            zz = 52.25354 + (((tickAnim - 13) / 0) * (78.34573-(52.25354)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -35.74606 + (((tickAnim - 13) / 1) * (44.73173-(-35.74606)));
            yy = -68.65726 + (((tickAnim - 13) / 1) * (-46.72126-(-68.65726)));
            zz = 78.34573 + (((tickAnim - 13) / 1) * (-49.27609-(78.34573)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 44.73173 + (((tickAnim - 14) / 1) * (19.59563-(44.73173)));
            yy = -46.72126 + (((tickAnim - 14) / 1) * (-44.17436-(-46.72126)));
            zz = -49.27609 + (((tickAnim - 14) / 1) * (-63.08167-(-49.27609)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 19.59563 + (((tickAnim - 15) / 1) * (-79.04924-(19.59563)));
            yy = -44.17436 + (((tickAnim - 15) / 1) * (-71.53904-(-44.17436)));
            zz = -63.08167 + (((tickAnim - 15) / 1) * (52.25354-(-63.08167)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -79.04924 + (((tickAnim - 16) / 1) * (-35.74606-(-79.04924)));
            yy = -71.53904 + (((tickAnim - 16) / 1) * (-68.65726-(-71.53904)));
            zz = 52.25354 + (((tickAnim - 16) / 1) * (78.34573-(52.25354)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -35.74606 + (((tickAnim - 17) / 1) * (44.73173-(-35.74606)));
            yy = -68.65726 + (((tickAnim - 17) / 1) * (-46.72126-(-68.65726)));
            zz = 78.34573 + (((tickAnim - 17) / 1) * (-49.27609-(78.34573)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 44.73173 + (((tickAnim - 18) / 0) * (19.59563-(44.73173)));
            yy = -46.72126 + (((tickAnim - 18) / 0) * (-44.17436-(-46.72126)));
            zz = -49.27609 + (((tickAnim - 18) / 0) * (-63.08167-(-49.27609)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 19.59563 + (((tickAnim - 18) / 1) * (-79.04924-(19.59563)));
            yy = -44.17436 + (((tickAnim - 18) / 1) * (-71.53904-(-44.17436)));
            zz = -63.08167 + (((tickAnim - 18) / 1) * (52.25354-(-63.08167)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -79.04924 + (((tickAnim - 19) / 1) * (-35.74606-(-79.04924)));
            yy = -71.53904 + (((tickAnim - 19) / 1) * (-68.65726-(-71.53904)));
            zz = 52.25354 + (((tickAnim - 19) / 1) * (78.34573-(52.25354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthindwing, righthindwing.rotateAngleX + (float) Math.toRadians(xx), righthindwing.rotateAngleY + (float) Math.toRadians(yy), righthindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -35.74606 + (((tickAnim - 0) / 1) * (44.73173-(-35.74606)));
            yy = 68.65726 + (((tickAnim - 0) / 1) * (46.72126-(68.65726)));
            zz = -78.34573 + (((tickAnim - 0) / 1) * (49.27609-(-78.34573)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 44.73173 + (((tickAnim - 1) / 1) * (19.59563-(44.73173)));
            yy = 46.72126 + (((tickAnim - 1) / 1) * (44.17436-(46.72126)));
            zz = 49.27609 + (((tickAnim - 1) / 1) * (63.08167-(49.27609)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 19.59563 + (((tickAnim - 2) / 1) * (-79.04924-(19.59563)));
            yy = 44.17436 + (((tickAnim - 2) / 1) * (71.53904-(44.17436)));
            zz = 63.08167 + (((tickAnim - 2) / 1) * (-52.25354-(63.08167)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -79.04924 + (((tickAnim - 3) / 0) * (-35.74606-(-79.04924)));
            yy = 71.53904 + (((tickAnim - 3) / 0) * (68.65726-(71.53904)));
            zz = -52.25354 + (((tickAnim - 3) / 0) * (-78.34573-(-52.25354)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -35.74606 + (((tickAnim - 3) / 1) * (44.73173-(-35.74606)));
            yy = 68.65726 + (((tickAnim - 3) / 1) * (46.72126-(68.65726)));
            zz = -78.34573 + (((tickAnim - 3) / 1) * (49.27609-(-78.34573)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 44.73173 + (((tickAnim - 4) / 1) * (19.59563-(44.73173)));
            yy = 46.72126 + (((tickAnim - 4) / 1) * (44.17436-(46.72126)));
            zz = 49.27609 + (((tickAnim - 4) / 1) * (63.08167-(49.27609)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 19.59563 + (((tickAnim - 5) / 1) * (-79.04924-(19.59563)));
            yy = 44.17436 + (((tickAnim - 5) / 1) * (71.53904-(44.17436)));
            zz = 63.08167 + (((tickAnim - 5) / 1) * (-52.25354-(63.08167)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -79.04924 + (((tickAnim - 6) / 1) * (-35.74606-(-79.04924)));
            yy = 71.53904 + (((tickAnim - 6) / 1) * (68.65726-(71.53904)));
            zz = -52.25354 + (((tickAnim - 6) / 1) * (-78.34573-(-52.25354)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -35.74606 + (((tickAnim - 7) / 1) * (44.73173-(-35.74606)));
            yy = 68.65726 + (((tickAnim - 7) / 1) * (46.72126-(68.65726)));
            zz = -78.34573 + (((tickAnim - 7) / 1) * (49.27609-(-78.34573)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 44.73173 + (((tickAnim - 8) / 0) * (19.59563-(44.73173)));
            yy = 46.72126 + (((tickAnim - 8) / 0) * (44.17436-(46.72126)));
            zz = 49.27609 + (((tickAnim - 8) / 0) * (63.08167-(49.27609)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 19.59563 + (((tickAnim - 8) / 1) * (-79.04924-(19.59563)));
            yy = 44.17436 + (((tickAnim - 8) / 1) * (71.53904-(44.17436)));
            zz = 63.08167 + (((tickAnim - 8) / 1) * (-52.25354-(63.08167)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -79.04924 + (((tickAnim - 9) / 1) * (-35.74606-(-79.04924)));
            yy = 71.53904 + (((tickAnim - 9) / 1) * (68.65726-(71.53904)));
            zz = -52.25354 + (((tickAnim - 9) / 1) * (-78.34573-(-52.25354)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -35.74606 + (((tickAnim - 10) / 1) * (44.73173-(-35.74606)));
            yy = 68.65726 + (((tickAnim - 10) / 1) * (46.72126-(68.65726)));
            zz = -78.34573 + (((tickAnim - 10) / 1) * (49.27609-(-78.34573)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 44.73173 + (((tickAnim - 11) / 1) * (19.59563-(44.73173)));
            yy = 46.72126 + (((tickAnim - 11) / 1) * (44.17436-(46.72126)));
            zz = 49.27609 + (((tickAnim - 11) / 1) * (63.08167-(49.27609)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 19.59563 + (((tickAnim - 12) / 1) * (-79.04924-(19.59563)));
            yy = 44.17436 + (((tickAnim - 12) / 1) * (71.53904-(44.17436)));
            zz = 63.08167 + (((tickAnim - 12) / 1) * (-52.25354-(63.08167)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -79.04924 + (((tickAnim - 13) / 0) * (-35.74606-(-79.04924)));
            yy = 71.53904 + (((tickAnim - 13) / 0) * (68.65726-(71.53904)));
            zz = -52.25354 + (((tickAnim - 13) / 0) * (-78.34573-(-52.25354)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -35.74606 + (((tickAnim - 13) / 1) * (44.73173-(-35.74606)));
            yy = 68.65726 + (((tickAnim - 13) / 1) * (46.72126-(68.65726)));
            zz = -78.34573 + (((tickAnim - 13) / 1) * (49.27609-(-78.34573)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 44.73173 + (((tickAnim - 14) / 1) * (19.59563-(44.73173)));
            yy = 46.72126 + (((tickAnim - 14) / 1) * (44.17436-(46.72126)));
            zz = 49.27609 + (((tickAnim - 14) / 1) * (63.08167-(49.27609)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 19.59563 + (((tickAnim - 15) / 1) * (-79.04924-(19.59563)));
            yy = 44.17436 + (((tickAnim - 15) / 1) * (71.53904-(44.17436)));
            zz = 63.08167 + (((tickAnim - 15) / 1) * (-52.25354-(63.08167)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -79.04924 + (((tickAnim - 16) / 1) * (-35.74606-(-79.04924)));
            yy = 71.53904 + (((tickAnim - 16) / 1) * (68.65726-(71.53904)));
            zz = -52.25354 + (((tickAnim - 16) / 1) * (-78.34573-(-52.25354)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -35.74606 + (((tickAnim - 17) / 1) * (44.73173-(-35.74606)));
            yy = 68.65726 + (((tickAnim - 17) / 1) * (46.72126-(68.65726)));
            zz = -78.34573 + (((tickAnim - 17) / 1) * (49.27609-(-78.34573)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 44.73173 + (((tickAnim - 18) / 0) * (19.59563-(44.73173)));
            yy = 46.72126 + (((tickAnim - 18) / 0) * (44.17436-(46.72126)));
            zz = 49.27609 + (((tickAnim - 18) / 0) * (63.08167-(49.27609)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 19.59563 + (((tickAnim - 18) / 1) * (-79.04924-(19.59563)));
            yy = 44.17436 + (((tickAnim - 18) / 1) * (71.53904-(44.17436)));
            zz = 63.08167 + (((tickAnim - 18) / 1) * (-52.25354-(63.08167)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -79.04924 + (((tickAnim - 19) / 1) * (-35.74606-(-79.04924)));
            yy = 71.53904 + (((tickAnim - 19) / 1) * (68.65726-(71.53904)));
            zz = -52.25354 + (((tickAnim - 19) / 1) * (-78.34573-(-52.25354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthindwing, lefthindwing.rotateAngleX + (float) Math.toRadians(xx), lefthindwing.rotateAngleY + (float) Math.toRadians(yy), lefthindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -127.62925 + (((tickAnim - 0) / 1) * (-265.94344-(-127.62925)));
            yy = 51.18666 + (((tickAnim - 0) / 1) * (52.62609-(51.18666)));
            zz = 194.00707 + (((tickAnim - 0) / 1) * (114.32288-(194.00707)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -265.94344 + (((tickAnim - 1) / 1) * (-319.40376-(-265.94344)));
            yy = 52.62609 + (((tickAnim - 1) / 1) * (65.05999-(52.62609)));
            zz = 114.32288 + (((tickAnim - 1) / 1) * (82.93933-(114.32288)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -319.40376 + (((tickAnim - 2) / 1) * (-109.56964-(-319.40376)));
            yy = 65.05999 + (((tickAnim - 2) / 1) * (53.3739-(65.05999)));
            zz = 82.93933 + (((tickAnim - 2) / 1) * (227.33455-(82.93933)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -109.56964 + (((tickAnim - 3) / 0) * (-127.62925-(-109.56964)));
            yy = 53.3739 + (((tickAnim - 3) / 0) * (51.18666-(53.3739)));
            zz = 227.33455 + (((tickAnim - 3) / 0) * (194.00707-(227.33455)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -127.62925 + (((tickAnim - 3) / 1) * (-265.94344-(-127.62925)));
            yy = 51.18666 + (((tickAnim - 3) / 1) * (52.62609-(51.18666)));
            zz = 194.00707 + (((tickAnim - 3) / 1) * (114.32288-(194.00707)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -265.94344 + (((tickAnim - 4) / 1) * (-319.40376-(-265.94344)));
            yy = 52.62609 + (((tickAnim - 4) / 1) * (65.05999-(52.62609)));
            zz = 114.32288 + (((tickAnim - 4) / 1) * (82.93933-(114.32288)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -319.40376 + (((tickAnim - 5) / 1) * (-109.56964-(-319.40376)));
            yy = 65.05999 + (((tickAnim - 5) / 1) * (53.3739-(65.05999)));
            zz = 82.93933 + (((tickAnim - 5) / 1) * (227.33455-(82.93933)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -109.56964 + (((tickAnim - 6) / 1) * (-127.62925-(-109.56964)));
            yy = 53.3739 + (((tickAnim - 6) / 1) * (51.18666-(53.3739)));
            zz = 227.33455 + (((tickAnim - 6) / 1) * (194.00707-(227.33455)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -127.62925 + (((tickAnim - 7) / 1) * (-265.94344-(-127.62925)));
            yy = 51.18666 + (((tickAnim - 7) / 1) * (52.62609-(51.18666)));
            zz = 194.00707 + (((tickAnim - 7) / 1) * (114.32288-(194.00707)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -265.94344 + (((tickAnim - 8) / 0) * (-319.40376-(-265.94344)));
            yy = 52.62609 + (((tickAnim - 8) / 0) * (65.05999-(52.62609)));
            zz = 114.32288 + (((tickAnim - 8) / 0) * (82.93933-(114.32288)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -319.40376 + (((tickAnim - 8) / 1) * (-109.56964-(-319.40376)));
            yy = 65.05999 + (((tickAnim - 8) / 1) * (53.3739-(65.05999)));
            zz = 82.93933 + (((tickAnim - 8) / 1) * (227.33455-(82.93933)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -109.56964 + (((tickAnim - 9) / 1) * (-127.62925-(-109.56964)));
            yy = 53.3739 + (((tickAnim - 9) / 1) * (51.18666-(53.3739)));
            zz = 227.33455 + (((tickAnim - 9) / 1) * (194.00707-(227.33455)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -127.62925 + (((tickAnim - 10) / 1) * (-265.94344-(-127.62925)));
            yy = 51.18666 + (((tickAnim - 10) / 1) * (52.62609-(51.18666)));
            zz = 194.00707 + (((tickAnim - 10) / 1) * (114.32288-(194.00707)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -265.94344 + (((tickAnim - 11) / 1) * (-319.40376-(-265.94344)));
            yy = 52.62609 + (((tickAnim - 11) / 1) * (65.05999-(52.62609)));
            zz = 114.32288 + (((tickAnim - 11) / 1) * (82.93933-(114.32288)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -319.40376 + (((tickAnim - 12) / 1) * (-109.56964-(-319.40376)));
            yy = 65.05999 + (((tickAnim - 12) / 1) * (53.3739-(65.05999)));
            zz = 82.93933 + (((tickAnim - 12) / 1) * (227.33455-(82.93933)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -109.56964 + (((tickAnim - 13) / 0) * (-127.62925-(-109.56964)));
            yy = 53.3739 + (((tickAnim - 13) / 0) * (51.18666-(53.3739)));
            zz = 227.33455 + (((tickAnim - 13) / 0) * (194.00707-(227.33455)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -127.62925 + (((tickAnim - 13) / 1) * (-265.94344-(-127.62925)));
            yy = 51.18666 + (((tickAnim - 13) / 1) * (52.62609-(51.18666)));
            zz = 194.00707 + (((tickAnim - 13) / 1) * (114.32288-(194.00707)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -265.94344 + (((tickAnim - 14) / 1) * (-319.40376-(-265.94344)));
            yy = 52.62609 + (((tickAnim - 14) / 1) * (65.05999-(52.62609)));
            zz = 114.32288 + (((tickAnim - 14) / 1) * (82.93933-(114.32288)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -319.40376 + (((tickAnim - 15) / 1) * (-109.56964-(-319.40376)));
            yy = 65.05999 + (((tickAnim - 15) / 1) * (53.3739-(65.05999)));
            zz = 82.93933 + (((tickAnim - 15) / 1) * (227.33455-(82.93933)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -109.56964 + (((tickAnim - 16) / 1) * (-127.62925-(-109.56964)));
            yy = 53.3739 + (((tickAnim - 16) / 1) * (51.18666-(53.3739)));
            zz = 227.33455 + (((tickAnim - 16) / 1) * (194.00707-(227.33455)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -127.62925 + (((tickAnim - 17) / 1) * (-265.94344-(-127.62925)));
            yy = 51.18666 + (((tickAnim - 17) / 1) * (52.62609-(51.18666)));
            zz = 194.00707 + (((tickAnim - 17) / 1) * (114.32288-(194.00707)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -265.94344 + (((tickAnim - 18) / 0) * (-319.40376-(-265.94344)));
            yy = 52.62609 + (((tickAnim - 18) / 0) * (65.05999-(52.62609)));
            zz = 114.32288 + (((tickAnim - 18) / 0) * (82.93933-(114.32288)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -319.40376 + (((tickAnim - 18) / 1) * (-109.56964-(-319.40376)));
            yy = 65.05999 + (((tickAnim - 18) / 1) * (53.3739-(65.05999)));
            zz = 82.93933 + (((tickAnim - 18) / 1) * (227.33455-(82.93933)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -109.56964 + (((tickAnim - 19) / 1) * (-127.62925-(-109.56964)));
            yy = 53.3739 + (((tickAnim - 19) / 1) * (51.18666-(53.3739)));
            zz = 227.33455 + (((tickAnim - 19) / 1) * (194.00707-(227.33455)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 35 + (((tickAnim - 0) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 12.5 + (((tickAnim - 1) / 1) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -55 + (((tickAnim - 2) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -50 + (((tickAnim - 3) / 0) * (35-(-50)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 35 + (((tickAnim - 3) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 4) / 1) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -55 + (((tickAnim - 5) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -50 + (((tickAnim - 6) / 1) * (35-(-50)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 7) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 12.5 + (((tickAnim - 8) / 0) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -55 + (((tickAnim - 8) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -50 + (((tickAnim - 9) / 1) * (35-(-50)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 35 + (((tickAnim - 10) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 12.5 + (((tickAnim - 11) / 1) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -55 + (((tickAnim - 12) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -50 + (((tickAnim - 13) / 0) * (35-(-50)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 35 + (((tickAnim - 13) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 12.5 + (((tickAnim - 14) / 1) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -55 + (((tickAnim - 15) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -50 + (((tickAnim - 16) / 1) * (35-(-50)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 35 + (((tickAnim - 17) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 12.5 + (((tickAnim - 18) / 0) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -55 + (((tickAnim - 18) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -50 + (((tickAnim - 19) / 1) * (35-(-50)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -127.62925 + (((tickAnim - 0) / 1) * (-265.94344-(-127.62925)));
            yy = -51.18666 + (((tickAnim - 0) / 1) * (-52.62609-(-51.18666)));
            zz = -194.00707 + (((tickAnim - 0) / 1) * (-114.32288-(-194.00707)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -265.94344 + (((tickAnim - 1) / 1) * (-319.40376-(-265.94344)));
            yy = -52.62609 + (((tickAnim - 1) / 1) * (-65.05999-(-52.62609)));
            zz = -114.32288 + (((tickAnim - 1) / 1) * (-82.93933-(-114.32288)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -319.40376 + (((tickAnim - 2) / 1) * (-109.56964-(-319.40376)));
            yy = -65.05999 + (((tickAnim - 2) / 1) * (-53.3739-(-65.05999)));
            zz = -82.93933 + (((tickAnim - 2) / 1) * (-227.33455-(-82.93933)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -109.56964 + (((tickAnim - 3) / 0) * (-127.62925-(-109.56964)));
            yy = -53.3739 + (((tickAnim - 3) / 0) * (-51.18666-(-53.3739)));
            zz = -227.33455 + (((tickAnim - 3) / 0) * (-194.00707-(-227.33455)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -127.62925 + (((tickAnim - 3) / 1) * (-265.94344-(-127.62925)));
            yy = -51.18666 + (((tickAnim - 3) / 1) * (-52.62609-(-51.18666)));
            zz = -194.00707 + (((tickAnim - 3) / 1) * (-114.32288-(-194.00707)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -265.94344 + (((tickAnim - 4) / 1) * (-319.40376-(-265.94344)));
            yy = -52.62609 + (((tickAnim - 4) / 1) * (-65.05999-(-52.62609)));
            zz = -114.32288 + (((tickAnim - 4) / 1) * (-82.93933-(-114.32288)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -319.40376 + (((tickAnim - 5) / 1) * (-109.56964-(-319.40376)));
            yy = -65.05999 + (((tickAnim - 5) / 1) * (-53.3739-(-65.05999)));
            zz = -82.93933 + (((tickAnim - 5) / 1) * (-227.33455-(-82.93933)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -109.56964 + (((tickAnim - 6) / 1) * (-127.62925-(-109.56964)));
            yy = -53.3739 + (((tickAnim - 6) / 1) * (-51.18666-(-53.3739)));
            zz = -227.33455 + (((tickAnim - 6) / 1) * (-194.00707-(-227.33455)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -127.62925 + (((tickAnim - 7) / 1) * (-265.94344-(-127.62925)));
            yy = -51.18666 + (((tickAnim - 7) / 1) * (-52.62609-(-51.18666)));
            zz = -194.00707 + (((tickAnim - 7) / 1) * (-114.32288-(-194.00707)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -265.94344 + (((tickAnim - 8) / 0) * (-319.40376-(-265.94344)));
            yy = -52.62609 + (((tickAnim - 8) / 0) * (-65.05999-(-52.62609)));
            zz = -114.32288 + (((tickAnim - 8) / 0) * (-82.93933-(-114.32288)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -319.40376 + (((tickAnim - 8) / 1) * (-109.56964-(-319.40376)));
            yy = -65.05999 + (((tickAnim - 8) / 1) * (-53.3739-(-65.05999)));
            zz = -82.93933 + (((tickAnim - 8) / 1) * (-227.33455-(-82.93933)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -109.56964 + (((tickAnim - 9) / 1) * (-127.62925-(-109.56964)));
            yy = -53.3739 + (((tickAnim - 9) / 1) * (-51.18666-(-53.3739)));
            zz = -227.33455 + (((tickAnim - 9) / 1) * (-194.00707-(-227.33455)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -127.62925 + (((tickAnim - 10) / 1) * (-265.94344-(-127.62925)));
            yy = -51.18666 + (((tickAnim - 10) / 1) * (-52.62609-(-51.18666)));
            zz = -194.00707 + (((tickAnim - 10) / 1) * (-114.32288-(-194.00707)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -265.94344 + (((tickAnim - 11) / 1) * (-319.40376-(-265.94344)));
            yy = -52.62609 + (((tickAnim - 11) / 1) * (-65.05999-(-52.62609)));
            zz = -114.32288 + (((tickAnim - 11) / 1) * (-82.93933-(-114.32288)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -319.40376 + (((tickAnim - 12) / 1) * (-109.56964-(-319.40376)));
            yy = -65.05999 + (((tickAnim - 12) / 1) * (-53.3739-(-65.05999)));
            zz = -82.93933 + (((tickAnim - 12) / 1) * (-227.33455-(-82.93933)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -109.56964 + (((tickAnim - 13) / 0) * (-127.62925-(-109.56964)));
            yy = -53.3739 + (((tickAnim - 13) / 0) * (-51.18666-(-53.3739)));
            zz = -227.33455 + (((tickAnim - 13) / 0) * (-194.00707-(-227.33455)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -127.62925 + (((tickAnim - 13) / 1) * (-265.94344-(-127.62925)));
            yy = -51.18666 + (((tickAnim - 13) / 1) * (-52.62609-(-51.18666)));
            zz = -194.00707 + (((tickAnim - 13) / 1) * (-114.32288-(-194.00707)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -265.94344 + (((tickAnim - 14) / 1) * (-319.40376-(-265.94344)));
            yy = -52.62609 + (((tickAnim - 14) / 1) * (-65.05999-(-52.62609)));
            zz = -114.32288 + (((tickAnim - 14) / 1) * (-82.93933-(-114.32288)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -319.40376 + (((tickAnim - 15) / 1) * (-109.56964-(-319.40376)));
            yy = -65.05999 + (((tickAnim - 15) / 1) * (-53.3739-(-65.05999)));
            zz = -82.93933 + (((tickAnim - 15) / 1) * (-227.33455-(-82.93933)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -109.56964 + (((tickAnim - 16) / 1) * (-127.62925-(-109.56964)));
            yy = -53.3739 + (((tickAnim - 16) / 1) * (-51.18666-(-53.3739)));
            zz = -227.33455 + (((tickAnim - 16) / 1) * (-194.00707-(-227.33455)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -127.62925 + (((tickAnim - 17) / 1) * (-265.94344-(-127.62925)));
            yy = -51.18666 + (((tickAnim - 17) / 1) * (-52.62609-(-51.18666)));
            zz = -194.00707 + (((tickAnim - 17) / 1) * (-114.32288-(-194.00707)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -265.94344 + (((tickAnim - 18) / 0) * (-319.40376-(-265.94344)));
            yy = -52.62609 + (((tickAnim - 18) / 0) * (-65.05999-(-52.62609)));
            zz = -114.32288 + (((tickAnim - 18) / 0) * (-82.93933-(-114.32288)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -319.40376 + (((tickAnim - 18) / 1) * (-109.56964-(-319.40376)));
            yy = -65.05999 + (((tickAnim - 18) / 1) * (-53.3739-(-65.05999)));
            zz = -82.93933 + (((tickAnim - 18) / 1) * (-227.33455-(-82.93933)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -109.56964 + (((tickAnim - 19) / 1) * (-127.62925-(-109.56964)));
            yy = -53.3739 + (((tickAnim - 19) / 1) * (-51.18666-(-53.3739)));
            zz = -227.33455 + (((tickAnim - 19) / 1) * (-194.00707-(-227.33455)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 35 + (((tickAnim - 0) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 12.5 + (((tickAnim - 1) / 1) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -55 + (((tickAnim - 2) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -50 + (((tickAnim - 3) / 0) * (35-(-50)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 35 + (((tickAnim - 3) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 4) / 1) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -55 + (((tickAnim - 5) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -50 + (((tickAnim - 6) / 1) * (35-(-50)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 7) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 12.5 + (((tickAnim - 8) / 0) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -55 + (((tickAnim - 8) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -50 + (((tickAnim - 9) / 1) * (35-(-50)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 35 + (((tickAnim - 10) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 12.5 + (((tickAnim - 11) / 1) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -55 + (((tickAnim - 12) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -50 + (((tickAnim - 13) / 0) * (35-(-50)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 35 + (((tickAnim - 13) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 12.5 + (((tickAnim - 14) / 1) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -55 + (((tickAnim - 15) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -50 + (((tickAnim - 16) / 1) * (35-(-50)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 35 + (((tickAnim - 17) / 1) * (12.5-(35)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 12.5 + (((tickAnim - 18) / 0) * (-55-(12.5)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -55 + (((tickAnim - 18) / 1) * (-50-(-55)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -50 + (((tickAnim - 19) / 1) * (35-(-50)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightantennae, rightantennae.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*5), rightantennae.rotateAngleY + (float) Math.toRadians(0), rightantennae.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftantennae, leftantennae.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*5), leftantennae.rotateAngleY + (float) Math.toRadians(0), leftantennae.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaboilus entity = (EntityPrehistoricFloraArchaboilus) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 20 + (((tickAnim - 0) / 1) * (21.25549-(20)));
            yy = 10 + (((tickAnim - 0) / 1) * (21.70506-(10)));
            zz = 0 + (((tickAnim - 0) / 1) * (4.56993-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 21.25549 + (((tickAnim - 1) / 1) * (20-(21.25549)));
            yy = 21.70506 + (((tickAnim - 1) / 1) * (10-(21.70506)));
            zz = 4.56993 + (((tickAnim - 1) / 1) * (0-(4.56993)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 2) / 8) * (20-(20)));
            yy = 10 + (((tickAnim - 2) / 8) * (10-(10)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(-15), rightwing2.rotateAngleY + (float) Math.toRadians(0), rightwing2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 20 + (((tickAnim - 0) / 1) * (21.25549-(20)));
            yy = -10 + (((tickAnim - 0) / 1) * (-21.70506-(-10)));
            zz = 0 + (((tickAnim - 0) / 1) * (-4.56993-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 21.25549 + (((tickAnim - 1) / 1) * (20-(21.25549)));
            yy = -21.70506 + (((tickAnim - 1) / 1) * (-10-(-21.70506)));
            zz = -4.56993 + (((tickAnim - 1) / 1) * (0-(-4.56993)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 2) / 8) * (20-(20)));
            yy = -10 + (((tickAnim - 2) / 8) * (-10-(-10)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(-15), leftwing2.rotateAngleY + (float) Math.toRadians(0), leftwing2.rotateAngleZ + (float) Math.toRadians(0));
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);


    }
}
