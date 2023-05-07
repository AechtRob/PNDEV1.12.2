package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHyperodapedon;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHyperodapedon extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended hyperodapedon;
    private final AdvancedModelRendererExtended hip;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended upperbody;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended frontleftleg;
    private final AdvancedModelRendererExtended frontleftleg2;
    private final AdvancedModelRendererExtended frontleftleg3;
    private final AdvancedModelRendererExtended frontrightleg4;
    private final AdvancedModelRendererExtended frontrightleg5;
    private final AdvancedModelRendererExtended frontrightleg6;
    private final AdvancedModelRendererExtended backleftleg;
    private final AdvancedModelRendererExtended backleftleg2;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended backleftleg3;
    private final AdvancedModelRendererExtended backrightleg4;
    private final AdvancedModelRendererExtended backrightleg5;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended backrightleg6;

    private ModelAnimator animator;

    public ModelHyperodapedon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.hyperodapedon = new AdvancedModelRendererExtended(this);
        this.hyperodapedon.setRotationPoint(0.0F, 17.0F, 5.0F);


        this.hip = new AdvancedModelRendererExtended(this);
        this.hip.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hyperodapedon.addChild(hip);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 21, -3.0F, -1.0F, -0.75F, 6, 5, 5, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 0.3042F, 4.3284F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.4013F, 0.0F, -0.0846F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -2.0F, -0.0199F, -0.2046F, 4, 3, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 1.2301F, 6.7954F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0443F, 0.0F, -0.0077F);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 10, -1.0F, -1.0F, -1.0F, 2, 2, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.3399F, 5.9122F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1335F, 0.0F, 0.0126F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 31, -0.4947F, -0.3452F, -0.6868F, 1, 1, 7, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -1.25F, -10.0F, 7, 6, 10, 0.0F, false));

        this.upperbody = new AdvancedModelRendererExtended(this);
        this.upperbody.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.body.addChild(upperbody);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.upperbody.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 0, -3.0F, -1.0F, -3.0F, 6, 5, 5, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -3.5F);
        this.upperbody.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 26, -2.5F, -1.0F, -3.85F, 5, 4, 5, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(-0.0909F, 2.0F, -2.75F);
        this.neck.addChild(head);


        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0909F, -0.0057F, 0.0297F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 38, 10, -2.5F, 0.0F, -2.0F, 5, 1, 2, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 38, 13, -2.0F, -1.75F, -1.5F, 4, 2, 2, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 9, 39, -1.5F, 0.0F, -4.0F, 3, 1, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-2.5F, 0.5F, -2.0F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.6109F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 35, 0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(2.5F, 0.5F, -2.0F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6109F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 35, -1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.5F, -3.75F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.7418F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 3, 0.25F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 3, 1.75F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, -0.0057F, 0.0297F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 34, 19, -2.9091F, -3.01F, -2.0F, 6, 3, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-2.4091F, -0.8949F, -2.1581F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0745F, -0.7383F, -0.0797F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.24F, -1.8372F, -2.4962F, 2, 2, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(2.5909F, -0.8949F, -2.1581F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0745F, 0.7383F, 0.0797F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.76F, -1.8372F, -2.4962F, 2, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-2.4091F, -0.8949F, -2.1581F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1181F, -0.7383F, -0.0797F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 5, -0.24F, -1.0872F, -2.4962F, 2, 2, 3, -0.01F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(2.5909F, -0.8949F, -2.1581F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1181F, 0.7383F, 0.0797F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 5, -1.76F, -1.0872F, -2.4962F, 2, 2, 3, -0.01F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0909F, -2.7622F, -4.446F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 40, -1.5F, -0.0275F, 0.1202F, 3, 3, 1, 0.01F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.8409F, 0.2525F, -4.7456F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.258F, 0.045F, 0.1687F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 16, -0.9189F, -2.8327F, -0.3706F, 1, 4, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-0.6591F, 0.2525F, -4.7456F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.258F, -0.045F, -0.1687F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 0, -0.0811F, -2.8327F, -0.3706F, 1, 4, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0909F, -2.0F, -2.0F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 31, -1.5F, -1.0F, -2.25F, 3, 3, 4, 0.0F, false));

        this.frontleftleg = new AdvancedModelRendererExtended(this);
        this.frontleftleg.setRotationPoint(3.0F, 3.25F, -3.0F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, 0.6545F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 32, 34, -2.3768F, -1.0F, -0.1787F, 3, 2, 4, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRendererExtended(this);
        this.frontleftleg2.setRotationPoint(-1.3768F, 0.0F, 3.0713F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.1309F, -0.6109F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 29, 40, -0.5F, 0.0F, -1.0F, 2, 3, 2, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRendererExtended(this);
        this.frontleftleg3.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.1309F, 0.0F, 0.0F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 35, 27, -1.0F, -0.25F, -3.75F, 3, 1, 4, 0.0F, false));

        this.frontrightleg4 = new AdvancedModelRendererExtended(this);
        this.frontrightleg4.setRotationPoint(-3.0F, 3.25F, -3.0F);
        this.upperbody.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.0F, -0.6545F, 0.0F);
        this.frontrightleg4.cubeList.add(new ModelBox(frontrightleg4, 32, 34, -0.6232F, -1.0F, -0.1787F, 3, 2, 4, 0.0F, true));

        this.frontrightleg5 = new AdvancedModelRendererExtended(this);
        this.frontrightleg5.setRotationPoint(1.3768F, 0.0F, 3.0713F);
        this.frontrightleg4.addChild(frontrightleg5);
        this.setRotateAngle(frontrightleg5, 0.1309F, 0.6109F, 0.0F);
        this.frontrightleg5.cubeList.add(new ModelBox(frontrightleg5, 29, 40, -1.5F, 0.0F, -1.0F, 2, 3, 2, 0.0F, true));

        this.frontrightleg6 = new AdvancedModelRendererExtended(this);
        this.frontrightleg6.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.frontrightleg5.addChild(frontrightleg6);
        this.setRotateAngle(frontrightleg6, -0.1309F, 0.0F, 0.0F);
        this.frontrightleg6.cubeList.add(new ModelBox(frontrightleg6, 35, 27, -2.0F, -0.25F, -3.75F, 3, 1, 4, 0.0F, true));

        this.backleftleg = new AdvancedModelRendererExtended(this);
        this.backleftleg.setRotationPoint(2.25F, 2.5F, 1.75F);
        this.hip.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.7681F, -0.1841F, -0.1872F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 0, 35, -0.75F, -1.0F, -2.0F, 3, 4, 3, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRendererExtended(this);
        this.backleftleg2.setRotationPoint(0.5F, 3.0F, -0.5F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.7734F, -0.1536F, 0.1555F);


        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.backleftleg2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 39, -0.5F, -0.75F, -1.25F, 2, 3, 2, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRendererExtended(this);
        this.backleftleg3.setRotationPoint(0.0F, 2.0F, 0.75F);
        this.backleftleg2.addChild(backleftleg3);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 15, 16, -1.0F, 0.0F, -3.5F, 3, 1, 4, 0.0F, false));

        this.backrightleg4 = new AdvancedModelRendererExtended(this);
        this.backrightleg4.setRotationPoint(-2.25F, 2.5F, 1.75F);
        this.hip.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.7681F, 0.1841F, 0.1872F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 0, 35, -2.25F, -1.0F, -2.0F, 3, 4, 3, 0.0F, true));

        this.backrightleg5 = new AdvancedModelRendererExtended(this);
        this.backrightleg5.setRotationPoint(-0.5F, 3.0F, -0.5F);
        this.backrightleg4.addChild(backrightleg5);
        this.setRotateAngle(backrightleg5, 0.7734F, 0.1536F, -0.1555F);


        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.backrightleg5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 39, -1.5F, -0.75F, -1.25F, 2, 3, 2, 0.0F, true));

        this.backrightleg6 = new AdvancedModelRendererExtended(this);
        this.backrightleg6.setRotationPoint(0.0F, 2.0F, 0.75F);
        this.backrightleg5.addChild(backrightleg6);
        this.backrightleg6.cubeList.add(new ModelBox(backrightleg6, 15, 16, -2.0F, 0.0F, -3.5F, 3, 1, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.rotateAngleX = (float)Math.toRadians(-25);
        this.lowerjaw.rotateAngleX = (float)Math.toRadians(40);
        this.neck.render(0.01F);
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
        //this.hip.offsetY = 1.15F;

        EntityPrehistoricFloraHyperodapedon Hyperodapedon = (EntityPrehistoricFloraHyperodapedon) e;
        float masterSpeed = Hyperodapedon.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3};
        Hyperodapedon.tailBuffer.applyChainSwingBuffer(Tail);

        if (Hyperodapedon.getAnimation() == Hyperodapedon.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (Hyperodapedon.getScreaming()) {
            this.neck.rotateAngleX = (float) Math.toRadians(-55);
            this.walk(lowerjaw, 1.5F, 0.15F, false, 0, 1.5F, f2, 1F);
        }

        if (f3 == 0.0F || !Hyperodapedon.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), -0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 0.965F;
        if (Hyperodapedon.getIsFast()) {
            speed = speed * 1.5F;
        }

        //this.frontleftleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 1, f2, 1.5F);;
        //this.frontrightleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 4, f2, 1.5F);;
        //this.rearleftleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);;
        //this.rearrightleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);;

        this.flap(frontleftleg, speed, -0.1F, true, 4, 0.05F, f2, 1F);
        this.flap(frontrightleg4, speed, 0.1F, true, 7, -0.05F, f2, 1F);
        this.flap(backleftleg, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(backrightleg4, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.swing(frontleftleg, speed, -0.40F, true, 5, 0.18F, f2, 1F);
        this.swing(frontrightleg4, speed, 0.40F, true, 8, -0.18F, f2, 1F);
        this.swing(backleftleg, speed, -0.30F, true, 8, 0F, f2, 1F);
        this.swing(backrightleg4, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.swing(frontleftleg2, speed, -0.25F, true, 6, 0F, f2, 1F);
        this.swing(frontrightleg5, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.swing(backleftleg, speed, -0.20F, true, 9, 0F, f2, 1F);
        this.swing(backrightleg5, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(frontleftleg2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(frontrightleg5, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(backleftleg, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(backrightleg5, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(frontleftleg3, speed, -0.30F, true, 2, 0.10F, f2, 1F);
        this.walk(frontrightleg6, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(backleftleg3, speed, -0.25F, true, 5, 0.08F, f2, 1F);
        this.walk(backrightleg6, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(body, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(body, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);
        this.flap(hip, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
        this.flap(upperbody, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(upperbody, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), -0.05F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.5), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHyperodapedon e = (EntityPrehistoricFloraHyperodapedon) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);

        animator.setAnimation(e.DRINK_ANIMATION); //120
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(12);
        animator.rotate(this.neck, (float) Math.toRadians(0.001), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(10);
    }
}
