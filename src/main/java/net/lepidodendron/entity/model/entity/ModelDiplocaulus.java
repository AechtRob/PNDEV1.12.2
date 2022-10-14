package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiplocaulus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDiplocaulus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer forelegR;
    private final AdvancedModelRenderer forelegR2;
    private final AdvancedModelRenderer forelegR3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer wholehead;
    private final AdvancedModelRenderer lowerhead;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer hindlegL;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer hindlegL3;
    private final AdvancedModelRenderer hindlegR;
    private final AdvancedModelRenderer hindlegR2;
    private final AdvancedModelRenderer hindlegR3;

    private ModelAnimator animator;

    public ModelDiplocaulus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 32, 24, -3.5F, -3.0F, 1.0F, 7, 3, 4, 0.0F, false));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(3.0F, -0.75F, 2.5F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.3054F, 0.0436F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 26, 12, 0.0F, -0.5F, -1.0F, 2, 1, 2, 0.01F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(1.65F, 0.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.48F, 0.0F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 0, 0, 0.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0F, 0.4363F, 0.0F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 26, 4, -0.1F, -0.5F, -1.5F, 2, 1, 3, -0.01F, false));

        this.forelegR = new AdvancedModelRenderer(this);
        this.forelegR.setRotationPoint(-3.0F, -0.75F, 2.5F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.3054F, -0.0436F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 26, 12, -2.0F, -0.5F, -1.0F, 2, 1, 2, 0.01F, true));

        this.forelegR2 = new AdvancedModelRenderer(this);
        this.forelegR2.setRotationPoint(-1.65F, 0.0F, 0.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -0.48F, 0.0F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 0, 0, -2.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

        this.forelegR3 = new AdvancedModelRenderer(this);
        this.forelegR3.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.0F, -0.4363F, 0.0F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 26, 4, -1.9F, -0.5F, -1.5F, 2, 1, 3, -0.01F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.5F, 1.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 38, 0, -3.0F, -1.0F, -3.0F, 6, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 6, -2.5F, -0.675F, 0.0F, 5, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0785F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 12, -2.5F, -0.55F, 0.0F, 5, 1, 4, 0.0F, false));

        this.wholehead = new AdvancedModelRenderer(this);
        this.wholehead.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.neck.addChild(wholehead);


        this.lowerhead = new AdvancedModelRenderer(this);
        this.lowerhead.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.wholehead.addChild(lowerhead);
        this.lowerhead.cubeList.add(new ModelBox(lowerhead, 40, 43, -1.5F, -0.75F, -3.0F, 3, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.lowerhead.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 29, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.wholehead.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.1745F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.75F, 2.0F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 41, 38, -1.5F, -1.2026F, -9.5392F, 3, 1, 4, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.75F, 2.0F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 12, -1.5F, -2.6526F, -9.5392F, 3, 1, 8, 0.01F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.upperjaw.addChild(bone2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.4F, 0.1F, -0.1F);
        this.bone2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.052F, 0.6482F, 0.0909F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 0, 4.2096F, -0.7032F, 2.8554F, 2, 1, 3, 0.005F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.4F, 0.1F, -0.1F);
        this.bone2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0609F, 0.8224F, 0.0776F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 40, 2.2127F, -0.7032F, 0.1364F, 4, 1, 4, 0.0075F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.4F, 0.1F, -0.1F);
        this.bone2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0716F, 0.9531F, 0.0639F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 24, 0.7115F, -0.7032F, -6.0901F, 6, 1, 7, 0.01F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.upperjaw.addChild(bone3);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.4F, 0.1F, -0.1F);
        this.bone3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.052F, -0.6482F, -0.0909F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 0, -6.2096F, -0.7032F, 2.8554F, 2, 1, 3, 0.005F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.4F, 0.1F, -0.1F);
        this.bone3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0609F, -0.8224F, -0.0776F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 40, -6.2127F, -0.7032F, 0.1364F, 4, 1, 4, 0.0075F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.4F, 0.1F, -0.1F);
        this.bone3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0716F, -0.9531F, -0.0639F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 24, -6.7115F, -0.7032F, -6.0901F, 6, 1, 7, 0.01F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -4.5F, -1.0F, 0.0F, 9, 3, 8, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 12, 32, -3.5F, -1.0F, -1.0F, 7, 3, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 38, 31, -2.5F, -1.0F, -1.0F, 5, 3, 4, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 3.0F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.01F, -2.2502F, -0.4738F, 0, 5, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 26, 41, -1.5F, -0.75F, -1.0F, 3, 2, 4, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 32, -1.0F, -0.75F, -0.5F, 2, 2, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 33, -0.01F, -2.2502F, -0.4738F, 0, 5, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0262F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 11, -0.5F, -0.75F, -0.5F, 1, 2, 11, -0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 7, 0.01F, -2.2502F, 0.5262F, 0, 5, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 29, -0.5F, -0.5F, 0.0F, 1, 1, 10, -0.02F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 14, -0.01F, -2.4992F, -0.096F, 0, 5, 10, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 26, 1, -0.5F, -0.5F, -0.25F, 1, 1, 10, -0.03F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, 0.01F, -2.4992F, -0.096F, 0, 5, 12, 0.0F, false));

        this.hindlegL = new AdvancedModelRenderer(this);
        this.hindlegL.setRotationPoint(2.0F, 1.0F, 1.0F);
        this.body4.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, -0.3927F, 0.0436F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 0, 33, -0.5F, -0.25F, -1.0F, 3, 1, 2, 0.01F, false));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(2.25F, 0.25F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, -0.4363F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 26, 15, 0.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(1.9F, 0.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.0F, -0.2618F, 0.0F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 0, 45, 0.0F, -0.5F, -1.5F, 3, 1, 3, -0.01F, false));

        this.hindlegR = new AdvancedModelRenderer(this);
        this.hindlegR.setRotationPoint(-2.0F, 1.0F, 1.0F);
        this.body4.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, 0.3927F, -0.0436F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 0, 33, -2.5F, -0.25F, -1.0F, 3, 1, 2, 0.01F, true));

        this.hindlegR2 = new AdvancedModelRenderer(this);
        this.hindlegR2.setRotationPoint(-2.25F, 0.25F, 0.0F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0F, 0.4363F, 0.0F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 26, 15, -2.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

        this.hindlegR3 = new AdvancedModelRenderer(this);
        this.hindlegR3.setRotationPoint(-1.9F, 0.0F, 0.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, 0.0F, 0.2618F, 0.0F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 0, 45, -3.0F, -0.5F, -1.5F, 3, 1, 3, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.385F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.Euchambersia.offsetZ = -0.6F;
        this.body.offsetX = -0.6F;
        this.body.offsetZ = -0.2F;
        this.upperjaw.rotateAngleX = (float) Math.toRadians(-5);
        this.wholehead.rotateAngleY = (float) Math.toRadians(-22.5);
        this.neck.rotateAngleY = (float) Math.toRadians(-17.5);
        this.body2.rotateAngleY = (float) Math.toRadians(17.5);
        this.body3.rotateAngleY = (float) Math.toRadians(15);
        this.body4.rotateAngleY = (float) Math.toRadians(22.5);
        this.tail.rotateAngleY = (float) Math.toRadians(27.4);
        this.tail2.rotateAngleY = (float) Math.toRadians(25);
        this.tail3.rotateAngleY = (float) Math.toRadians(24.9);
        this.tail4.rotateAngleY = (float) Math.toRadians(30);
        this.tail5.rotateAngleY = (float) Math.toRadians(32.5);
        this.body.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 0.925F; //72

        EntityPrehistoricFloraDiplocaulus Diplocaulus = (EntityPrehistoricFloraDiplocaulus) e;

        this.faceTarget(f3, f4, 4, body);

        float speed = 0.225F / 2F;
        if (Diplocaulus.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Torso = {this.neck, this.body, this.body2};

        if (!Diplocaulus.isReallyInWater()) {

            if (f3 == 0.0F || !Diplocaulus.getIsMoving()) { //Not moving
                return;
            }

            this.flap(hindlegL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(hindlegL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(hindlegL2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(hindlegL3, speed, 0.3F, false, 1, 0.15F, f2, 0.5F);

            this.flap(hindlegR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(hindlegR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(hindlegR2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(hindlegR3, speed, 0.3F, false, 4, 0.15F, f2, 0.5F);

            this.flap(forelegL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(forelegL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(forelegL2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(forelegL3, speed, -0.2F, true, 8, 0.1F, f2, 0.8F);

            this.flap(forelegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(forelegR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(forelegR2, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);
            this.walk(forelegR3, speed, 0.2F, false, 1, 0.1F, f2, 0.5F);

            //this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            //this.bob(body, speed*2, 0.3F, false, f2, 1F);

            this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 4F;

            AdvancedModelRenderer[] BackL = {this.hindlegL, this.hindlegL2, this.hindlegL3};
            AdvancedModelRenderer[] BackR = {this.hindlegR, this.hindlegR2, this.hindlegR3};
            AdvancedModelRenderer[] FrontL = {this.forelegL, this.forelegL2, this.forelegL3};
            AdvancedModelRenderer[] FrontR = {this.forelegR, this.forelegR2, this.forelegR3};

            this.flap(hindlegL, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(hindlegR, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F, f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(forelegL, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(forelegR, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(FrontL, speed, -0.3F, -1, 0F, f2, 1);
            this.chainWaveExtended(FrontR, speed, -0.3F, -1, 3F, f2, 1);

            this.chainWave(Tail, speed, 0.006F, -0.1, f2, 0.5F);
            this.chainSwing(Tail, speed, 0.35F, -3.3, f2, 0.6F);
            this.chainSwing(Torso, speed, 0.2F, -0.12, f2, 0.7F);
            this.swing(body, speed, 0.15F, true, 0, 0, f2, 1);
            this.bob(body, speed, 0.05F, false, f2, 1);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.wholehead, 0,0,-0.3F);
        animator.rotate(this.wholehead, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.wholehead, 0,0,-0.3F);
        animator.rotate(this.wholehead, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
