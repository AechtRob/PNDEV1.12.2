package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEorhynchochelys;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelEorhynchochelys extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended backleftleg;
    private final AdvancedModelRendererExtended backleftleg2;
    private final AdvancedModelRendererExtended backleftleg3;
    private final AdvancedModelRendererExtended backrightleg;
    private final AdvancedModelRendererExtended backrightleg2;
    private final AdvancedModelRendererExtended backrightleg3;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended tail6;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended frontleftarm;
    private final AdvancedModelRendererExtended frontleftarm2;
    private final AdvancedModelRendererExtended frontleftarm3;
    private final AdvancedModelRendererExtended frontrightarm;
    private final AdvancedModelRendererExtended frontrightarm2;
    private final AdvancedModelRendererExtended frontrightarm3;

    private ModelAnimator animator;

    public ModelEorhynchochelys() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 20.0F, 1.5F);
        this.body.cubeList.add(new ModelBox(body, 25, 27, -5.0F, -3.0F, -2.5F, 10, 6, 5, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -1.85F, 1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -7.0F, -1.2963F, -0.1043F, 14, 7, 14, 0.0F, false));

        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, 2.9537F, 12.9957F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 21, -5.0F, -3.5556F, -0.4085F, 10, 6, 5, 0.0F, false));

        this.backleftleg = new AdvancedModelRendererExtended(this);
        this.backleftleg.setRotationPoint(4.25F, 0.6944F, 2.0915F);
        this.body3.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.0668F, -0.6516F, 0.1098F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 30, 21, -1.25F, -1.5F, -1.5F, 7, 3, 3, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRendererExtended(this);
        this.backleftleg2.setRotationPoint(5.75F, 0.0F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, -0.0411F, -0.3027F, 0.1372F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 42, 9, -1.0F, -1.0F, -1.5F, 6, 2, 3, -0.01F, false));

        this.backleftleg3 = new AdvancedModelRendererExtended(this);
        this.backleftleg3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.0F, -0.4363F, 0.0873F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 55, 39, 0.0F, -0.5F, -2.0F, 3, 1, 4, 0.0F, false));
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 68, 38, 3.0F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

        this.backrightleg = new AdvancedModelRendererExtended(this);
        this.backrightleg.setRotationPoint(-4.25F, 0.6944F, 2.0915F);
        this.body3.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.0668F, 0.6516F, -0.1098F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 30, 21, -5.75F, -1.5F, -1.5F, 7, 3, 3, 0.0F, true));

        this.backrightleg2 = new AdvancedModelRendererExtended(this);
        this.backrightleg2.setRotationPoint(-5.75F, 0.0F, 0.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, -0.0411F, 0.3027F, -0.1372F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 42, 9, -5.0F, -1.0F, -1.5F, 6, 2, 3, -0.01F, true));

        this.backrightleg3 = new AdvancedModelRendererExtended(this);
        this.backrightleg3.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.0F, 0.4363F, -0.0873F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 55, 39, -3.0F, -0.5F, -2.0F, 3, 1, 4, 0.0F, true));
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 68, 38, -4.0F, -0.5F, -2.0F, 1, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -0.4816F, 4.5659F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 48, 48, -3.5F, -2.0455F, -0.9137F, 7, 4, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.5455F, 3.0863F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 38, -2.0F, -0.9578F, -0.9336F, 4, 3, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.5422F, 6.0664F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 49, -1.5F, -1.5583F, 0.393F, 3, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.2983F, 6.393F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 38, -1.0F, -0.75F, 0.0F, 2, 2, 8, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 30, 39, -0.5F, -0.75F, -0.0019F, 1, 2, 10, 0.0F, false));

        this.tail6 = new AdvancedModelRendererExtended(this);
        this.tail6.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 32, -0.5F, 0.25F, -0.0019F, 1, 1, 11, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 42, 0, -3.0F, -1.75F, -4.0F, 6, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 2.25F, -6.0F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 44, -2.5F, -2.5F, 2.0F, 5, 2, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 32, 52, -2.5F, -1.5436F, -2.999F, 5, 3, 4, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(-0.5F, -0.0436F, -2.749F);
        this.neck2.addChild(head);


        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.4564F, 0.001F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 56, 10, -1.5F, 0.0F, -4.0F, 4, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 0, -1.5F, -1.75F, -1.75F, 4, 2, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.lowerjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 8, -1.0F, -1.0F, -1.5F, 3, 1, 1, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -1.0F, -1.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 0.4564F, 0.001F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 54, -1.5F, -2.0F, -4.0F, 4, 2, 4, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 8, 4, 1.6F, -1.8128F, -2.9519F, 1, 1, 1, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 8, 4, -1.6F, -1.8128F, -2.9519F, 1, 1, 1, 0.01F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 4, -1.0F, 0.0F, -2.0F, 3, 2, 2, 0.01F, false));

        this.frontleftarm = new AdvancedModelRendererExtended(this);
        this.frontleftarm.setRotationPoint(4.75F, 1.5F, -0.25F);
        this.body.addChild(frontleftarm);
        this.setRotateAngle(frontleftarm, -0.1581F, 0.3445F, 0.1106F);
        this.frontleftarm.cubeList.add(new ModelBox(frontleftarm, 50, 21, -0.75F, -1.5F, -1.5F, 7, 3, 3, 0.0F, false));

        this.frontleftarm2 = new AdvancedModelRendererExtended(this);
        this.frontleftarm2.setRotationPoint(6.25F, 0.0F, 0.0F);
        this.frontleftarm.addChild(frontleftarm2);
        this.setRotateAngle(frontleftarm2, 0.0233F, -0.2608F, 0.1715F);
        this.frontleftarm2.cubeList.add(new ModelBox(frontleftarm2, 50, 27, -1.0F, -1.0F, -1.5F, 6, 2, 3, -0.01F, false));

        this.frontleftarm3 = new AdvancedModelRendererExtended(this);
        this.frontleftarm3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.frontleftarm2.addChild(frontleftarm3);
        this.setRotateAngle(frontleftarm3, 0.0406F, -0.4346F, -0.0962F);
        this.frontleftarm3.cubeList.add(new ModelBox(frontleftarm3, 55, 39, 0.0F, -0.5F, -2.0F, 3, 1, 4, 0.0F, false));
        this.frontleftarm3.cubeList.add(new ModelBox(frontleftarm3, 68, 38, 3.0F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

        this.frontrightarm = new AdvancedModelRendererExtended(this);
        this.frontrightarm.setRotationPoint(-4.75F, 1.5F, -0.25F);
        this.body.addChild(frontrightarm);
        this.setRotateAngle(frontrightarm, -0.1581F, -0.3445F, -0.1106F);
        this.frontrightarm.cubeList.add(new ModelBox(frontrightarm, 50, 21, -6.25F, -1.5F, -1.5F, 7, 3, 3, 0.0F, true));

        this.frontrightarm2 = new AdvancedModelRendererExtended(this);
        this.frontrightarm2.setRotationPoint(-6.25F, 0.0F, 0.0F);
        this.frontrightarm.addChild(frontrightarm2);
        this.setRotateAngle(frontrightarm2, 0.0233F, 0.2608F, -0.1715F);
        this.frontrightarm2.cubeList.add(new ModelBox(frontrightarm2, 50, 27, -5.0F, -1.0F, -1.5F, 6, 2, 3, -0.01F, true));

        this.frontrightarm3 = new AdvancedModelRendererExtended(this);
        this.frontrightarm3.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.frontrightarm2.addChild(frontrightarm3);
        this.setRotateAngle(frontrightarm3, 0.0406F, 0.4346F, 0.0962F);
        this.frontrightarm3.cubeList.add(new ModelBox(frontrightarm3, 55, 39, -3.0F, -0.5F, -2.0F, 3, 1, 4, 0.0F, true));
        this.frontrightarm3.cubeList.add(new ModelBox(frontrightarm3, 68, 38, -4.0F, -0.5F, -2.0F, 1, 1, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.42f);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -0.8F;
        this.head.rotateAngleY = (float)Math.toRadians(-17.5);
        this.neck2.rotateAngleY = (float)Math.toRadians(-22.5);
        this.neck.rotateAngleY = (float)Math.toRadians(-17.5);
        this.tail.rotateAngleY = (float)Math.toRadians(12.5);
        this.tail2.rotateAngleY = (float)Math.toRadians(25);
        this.tail3.rotateAngleY = (float)Math.toRadians(17.5);
        this.tail4.rotateAngleY = (float)Math.toRadians(32.5);
        this.tail5.rotateAngleY = (float)Math.toRadians(32.5);
        this.tail6.rotateAngleY = (float)Math.toRadians(27.5);
        this.lowerjaw.rotateAngleX = (float)Math.toRadians(22.5);
        this.body.render(0.1F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 0.88F;
        this.body.offsetZ = -0.2F;

        EntityPrehistoricFloraEorhynchochelys Eorhynchochelys = (EntityPrehistoricFloraEorhynchochelys) e;

        //this.faceTarget(f3, f4, 5, neckbase);
        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};

        AdvancedModelRenderer[] FL = {this.frontleftarm, this.frontleftarm2, this.frontleftarm3};
        AdvancedModelRenderer[] FR = {this.frontrightarm, this.frontrightarm2, this.frontrightarm3};
        AdvancedModelRenderer[] BL = {this.backleftleg, this.backleftleg2, this.backleftleg3};
        AdvancedModelRenderer[] BR = {this.backrightleg, this.backrightleg2, this.backrightleg3};

        if (!Eorhynchochelys.isReallyInWater()) {

            if (!Eorhynchochelys.getIsMoving()) {
                return;
            }

            this.swing(this.frontrightarm, speed * 0.6F, 0.5F,false, -0.8F,0.6F, f2, 1F);
            this.swing(this.frontleftarm, speed * 0.6F, 0.5F,true, 0.8F,0.6F, f2, 1F);

            this.swing(this.backrightleg, speed * 0.6F, 0.3F,false, -0.8F,0.4F, f2, 1F);
            this.swing(this.backleftleg, speed * 0.6F, 0.3F,true, 0.8F,0.4F, f2, 1F);

            this.chainWave(Tail, speed * 0.3F, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.5F, 0.12F, -3, f2, 0.8F);

        }
        else {

            if (f3 == 0.0F) {
               // this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed * 0.8F, 0.06F, -3, f2, 0.8F);
                return;
            }

            speed = speed * 2F;

            this.chainWaveExtended(FR, speed * 0.8F, -0.1F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.1F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BR, speed * 0.8F, -0.1F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BL, speed * 0.8F, -0.1F, 1.5, 0, f2, 0.8F);

            this.chainWaveExtended(FR, speed * 0.8F, -0.1F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.1F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BR, speed * 0.8F, -0.1F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BL, speed * 0.8F, -0.1F, 1.5, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.25F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.25F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.2F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.2F, -1.5, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.25F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.25F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.2F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.2F, -1.5, 0, f2, 0.8F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed *0.8F, 0.26F, -3, f2, 1F);

        }
    }
    /*public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEorhynchochelys ee = (EntityPrehistoricFloraEorhynchochelys) entitylivingbaseIn;
        if(!ee.getIsMoving()) {
            return;
        }
    }
     */

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(0), -(float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
