package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraWhatcheeria;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelWhatcheeria extends AdvancedModelBaseExtended {

    private final AdvancedModelRendererExtended whatcheeria;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended backleftleg;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended backleftleg2;
    private final AdvancedModelRendererExtended backleftleg3;
    private final AdvancedModelRendererExtended backrightleg4;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended backrightleg5;
    private final AdvancedModelRendererExtended backrightleg6;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended frontleftleg;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended frontleftleg2;
    private final AdvancedModelRendererExtended frontleftleg3;
    private final AdvancedModelRendererExtended frontrightleg4;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended frontrightleg5;
    private final AdvancedModelRendererExtended frontrightleg6;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;

    private ModelAnimator animator;

    public ModelWhatcheeria() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.whatcheeria = new AdvancedModelRendererExtended(this);
        this.whatcheeria.setRotationPoint(0.0F, 22.25F, 0.0F);


        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, -4.1069F, 7.1259F);
        this.whatcheeria.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 20, 20, -2.5F, -1.125F, -1.0F, 5, 5, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 28, 1, 0.0F, -2.375F, -1.0F, 0, 2, 6, 0.0F, false));

        this.backleftleg = new AdvancedModelRendererExtended(this);
        this.backleftleg.setRotationPoint(2.5F, 2.625F, 2.75F);
        this.body3.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0576F, 0.1463F, -0.2082F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.75F, 0.0F, -0.5F);
        this.backleftleg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 39, -2.0F, -1.0F, -1.0F, 4, 2, 3, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRendererExtended(this);
        this.backleftleg2.setRotationPoint(2.75F, 0.25F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, -0.0341F, -0.1264F, 0.1331F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 35, 44, -1.75F, -0.25F, -1.0F, 2, 3, 2, -0.01F, false));

        this.backleftleg3 = new AdvancedModelRendererExtended(this);
        this.backleftleg3.setRotationPoint(-0.75F, 2.5F, -0.25F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.1297F, -0.3776F, 0.0014F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 23, 44, -1.5F, -0.25F, -2.25F, 3, 1, 3, 0.0F, false));

        this.backrightleg4 = new AdvancedModelRendererExtended(this);
        this.backrightleg4.setRotationPoint(-2.5F, 2.625F, 2.75F);
        this.body3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.0576F, -0.1463F, 0.2082F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-0.75F, 0.0F, -0.5F);
        this.backrightleg4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 39, -2.0F, -1.0F, -1.0F, 4, 2, 3, 0.0F, true));

        this.backrightleg5 = new AdvancedModelRendererExtended(this);
        this.backrightleg5.setRotationPoint(-2.75F, 0.25F, 0.0F);
        this.backrightleg4.addChild(backrightleg5);
        this.setRotateAngle(backrightleg5, -0.0341F, 0.1264F, -0.1331F);
        this.backrightleg5.cubeList.add(new ModelBox(backrightleg5, 35, 44, -0.25F, -0.25F, -1.0F, 2, 3, 2, -0.01F, true));

        this.backrightleg6 = new AdvancedModelRendererExtended(this);
        this.backrightleg6.setRotationPoint(0.75F, 2.5F, -0.25F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, 0.1297F, 0.3776F, -0.0014F);
        this.backrightleg6.cubeList.add(new ModelBox(backrightleg6, 23, 44, -1.5F, -0.25F, -2.25F, 3, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -0.625F, 5.0F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 27, 29, -0.02F, -1.0F, -0.25F, 0, 1, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 32, 31, -2.0F, 0.0F, -1.0F, 4, 4, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 31, -1.5F, -0.5F, -1.0F, 3, 3, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 26, -0.01F, -1.5F, -0.25F, 0, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.0833F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 30, -1.0F, -0.25F, -1.0833F, 2, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 12, 0.0F, -1.75F, -0.8333F, 0, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 0, 0.0F, 1.75F, -1.0833F, 0, 1, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(-0.005F, 0.75F, 4.9167F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 12, 39, -0.495F, -0.5F, -1.0F, 1, 1, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 17, -0.005F, -2.25F, 0.0F, 0, 4, 9, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, 1.625F, 0.0F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, 0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 13, -3.0F, -3.0F, -7.0F, 6, 6, 7, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.2319F, -5.8759F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -3.2319F, -7.1241F, 7, 6, 7, 0.01F, false));

        this.frontleftleg = new AdvancedModelRendererExtended(this);
        this.frontleftleg.setRotationPoint(3.25F, 1.2681F, -5.1241F);
        this.body.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0436F, -0.48F, 0.0F);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.75F, 0.0F, -0.5F);
        this.frontleftleg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.4363F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 39, -2.0F, -1.0F, -1.0F, 4, 2, 3, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRendererExtended(this);
        this.frontleftleg2.setRotationPoint(2.75F, 0.25F, 0.0F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.0076F, 0.044F, -0.1316F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 35, 44, -1.75F, -0.25F, -1.0F, 2, 3, 2, -0.01F, false));

        this.frontleftleg3 = new AdvancedModelRendererExtended(this);
        this.frontleftleg3.setRotationPoint(-0.75F, 2.5F, -0.25F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.0214F, -0.1129F, 0.1195F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 23, 44, -1.5F, -0.25F, -2.25F, 3, 1, 3, 0.0F, false));

        this.frontrightleg4 = new AdvancedModelRendererExtended(this);
        this.frontrightleg4.setRotationPoint(-3.25F, 1.2681F, -5.1241F);
        this.body.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.0436F, 0.48F, 0.0F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-0.75F, 0.0F, -0.5F);
        this.frontrightleg4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.4363F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 39, -2.0F, -1.0F, -1.0F, 4, 2, 3, 0.0F, true));

        this.frontrightleg5 = new AdvancedModelRendererExtended(this);
        this.frontrightleg5.setRotationPoint(-2.75F, 0.25F, 0.0F);
        this.frontrightleg4.addChild(frontrightleg5);
        this.setRotateAngle(frontrightleg5, -0.0076F, -0.044F, 0.1316F);
        this.frontrightleg5.cubeList.add(new ModelBox(frontrightleg5, 35, 44, -0.25F, -0.25F, -1.0F, 2, 3, 2, -0.01F, true));

        this.frontrightleg6 = new AdvancedModelRendererExtended(this);
        this.frontrightleg6.setRotationPoint(0.75F, 2.5F, -0.25F);
        this.frontrightleg5.addChild(frontrightleg6);
        this.setRotateAngle(frontrightleg6, -0.0214F, 0.1129F, -0.1195F);
        this.frontrightleg6.cubeList.add(new ModelBox(frontrightleg6, 23, 44, -1.5F, -0.25F, -2.25F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.5F, -3.0F, -7.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 25, 10, -3.5F, 0.0F, -2.5F, 6, 5, 3, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(-0.5F, 0.0F, -2.25F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 21, 0, -2.5F, 0.0922F, -3.3117F, 5, 2, 4, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 1.55F, 0.5922F, -2.8117F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.55F, 0.5922F, -2.8117F, 1, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.221F, -3.3585F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 27, -2.0F, -0.0661F, -2.7813F, 4, 1, 3, -0.011F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 3.0F, -2.75F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 38, -2.5F, -1.75F, -0.75F, 5, 1, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 43, -2.0F, -1.75F, -3.75F, 4, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.4387F, -0.5759F);
        this.head.addChild(jaw);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 1.517F, -1.0733F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 7, -2.0F, -0.75F, -5.0F, 4, 1, 3, -0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 2, -2.5F, -0.75F, -2.0F, 5, 1, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 0.5613F, -2.1741F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 18, -2.5F, -0.75F, -0.75F, 5, 1, 4, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 23, -2.0F, -0.75F, -3.75F, 4, 1, 3, 0.0001F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.whatcheeria.render(f5 * 0.3f);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.offsetZ = -0.7F;
        this.body.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.whatcheeria.offsetY = 1.05F;

        EntityPrehistoricFloraWhatcheeria Whatcheeria = (EntityPrehistoricFloraWhatcheeria) e;

        this.faceTarget(f3, f4, 6, head);

        float speed = 0.185F;
        if (Whatcheeria.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Torso = {this.neck, this.body, this.body2};

        if (!Whatcheeria.isReallyInWater()) {

            if (f3 == 0.0F || !Whatcheeria.getIsMoving()) { //Not moving
                return;
            }

            this.flap(backleftleg, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(backleftleg, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(backleftleg2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(backleftleg3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(backrightleg4, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(backrightleg4, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(backrightleg5, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(backrightleg6, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(frontleftleg, speed, 0.35F, false, 3, -0.1F, f2, 0.5F);
            //this.swing(legFL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(frontleftleg2, speed, -0.4F, false, 4, 0.15F, f2, 0.8F);
            this.walk(frontleftleg3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(frontrightleg4, speed, -0.35F, false, 0, 0.1F, f2, 0.5F);
            //this.swing(legFR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(frontrightleg5, speed, -0.4F, false, 1, 0.15F, f2, 0.8F);
            this.walk(frontrightleg6, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.16, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.08F, -0.16, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.08F, -0.16, f2, 0.7F);
            this.bob(body, speed*2, 0.11F, false, f2, 1F);

            this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.45), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 1.5F;

            //Feet:
            this.setRotateAngle(frontleftleg2, (float) Math.toRadians(2.5159), (float) Math.toRadians(-0.4522), (float) Math.toRadians(-77.5384));
            this.setRotateAngle(frontrightleg5, -(float) Math.toRadians(2.5159), -(float) Math.toRadians(-0.4522), -(float) Math.toRadians(-77.5384));
            this.setRotateAngle(frontleftleg3, (float) Math.toRadians(96.2757), (float) Math.toRadians(6.4678), (float) Math.toRadians(6.8473));
            this.setRotateAngle(frontrightleg6, -(float) Math.toRadians(-96.2757), -(float) Math.toRadians(-6.4678), -(float) Math.toRadians(6.8473));

            this.setRotateAngle(backleftleg, (float) Math.toRadians(-4.362), -(float) Math.toRadians(41.5195), (float) Math.toRadians(-15.3064));
            this.setRotateAngle(backrightleg4, -(float) Math.toRadians(-4.362), (float) Math.toRadians(41.5195), -(float) Math.toRadians(-15.3064));
            this.setRotateAngle(backleftleg2, -(float) Math.toRadians(-30.7589), -(float) Math.toRadians(4.8128), (float) Math.toRadians(-57.7422));
            this.setRotateAngle(backrightleg5, -(float) Math.toRadians(-30.7589), (float) Math.toRadians(4.8128), -(float) Math.toRadians(-57.7422));
            this.setRotateAngle(backleftleg3, -(float) Math.toRadians(-114.9316), -(float) Math.toRadians(21.6328), (float) Math.toRadians(0));
            this.setRotateAngle(backrightleg6, -(float) Math.toRadians(-114.9316), (float) Math.toRadians(21.6328), (float) Math.toRadians(0));


            AdvancedModelRenderer[] FrontL = {this.frontleftleg2, this.frontleftleg3};
            AdvancedModelRenderer[] FrontR = {this.frontrightleg5, this.frontrightleg6};

            AdvancedModelRenderer[] BackL = {this.backleftleg, this.backleftleg2, this.backleftleg3};
            AdvancedModelRenderer[] BackR = {this.backrightleg4, this.backrightleg5, this.backrightleg6};

            this.chainSwingExtended(BackL, speed, -0.3F, -1, 0F,  f2, 1);
            this.chainSwingExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.swing(frontleftleg, speed, 0.3F, true, 3, 0, f2, 1F);
            this.chainWaveExtended(FrontL, speed, -0.2F, 0, 0F,  f2, 1);
            this.swing(frontrightleg4, speed, 0.3F, true, 3, 0, f2, 1F);
            this.chainWaveExtended(FrontR, speed, -0.2F, 0, 3F, f2, 1);


            this.chainWave(Tail, speed, 0.1F, -0.16, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.3F, -0.16, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.16, f2, 0.7F);
        }
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraWhatcheeria e = (EntityPrehistoricFloraWhatcheeria) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.jaw, -(float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
