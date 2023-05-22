package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraElasmodectes;
import net.lepidodendron.entity.EntityPrehistoricFloraIschyodus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelIschyodus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer dorsal;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer crest;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;

    public ModelIschyodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 27.0F, 10.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -9.0F, -15.0F, 6, 6, 7, 0.01F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.1328F, -4.125F, -13.9366F);
        this.body.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, -0.1384F, 0.4252F, 0.079F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 11, 30, -0.5578F, -1.0F, 0.0366F, 1, 2, 3, 0.0F, false));
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 34, 25, -0.0578F, -4.0F, 1.0366F, 0, 6, 6, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-3.1328F, -4.125F, -13.9366F);
        this.body.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.1384F, -0.4252F, -0.079F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 11, 30, -0.4422F, -1.0F, 0.0366F, 1, 2, 3, 0.0F, true));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 34, 25, 0.0578F, -4.0F, 1.0366F, 0, 6, 6, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -7.3687F, -7.983F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 20, -2.5F, -0.8813F, -0.117F, 5, 4, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.8813F, -0.117F);
        this.tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -2.75F, 3.05F, 0, 3, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 1, -2.5F, 0.25F, 0.05F, 4, 1, 6, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.3187F, -0.117F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.192F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 7, -2.5F, -2.0F, 0.1F, 5, 2, 6, -0.01F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.5265F, 2.3733F, 4.4518F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.4597F, 0.4176F, -0.6863F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 19, 0, -0.6015F, -0.0047F, -0.5688F, 1, 2, 2, 0.0F, false));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 26, 0.1485F, -0.0047F, -0.5688F, 0, 7, 4, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.5265F, 2.3733F, 4.4518F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.4597F, -0.4176F, 0.6863F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 19, 0, -0.3985F, -0.0047F, -0.5688F, 1, 2, 2, 0.0F, true));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 0, 26, -0.1485F, -0.0047F, -0.5688F, 0, 7, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1047F, 5.7823F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 37, 17, -2.0F, -0.736F, 0.1007F, 4, 3, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.386F, 0.1257F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0567F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 15, -0.5F, -2.0156F, 0.0045F, 0, 2, 5, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 40, -2.0F, -0.0156F, 0.0045F, 3, 1, 5, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 2.764F, 0.1007F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0785F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 0, -2.5F, -0.85F, -0.95F, 4, 1, 6, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1412F, 5.056F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 42, 25, -1.5F, -0.5948F, 0.0447F, 3, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.4052F, 0.0447F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2051F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 39, -1.5F, -1.9F, -0.85F, 3, 2, 5, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.9448F, 0.0447F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0742F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 11, 0.0F, -1.0F, 0.0F, 0, 1, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 44, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.0042F, 0.3396F, 4.0322F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 44, 8, -0.9958F, -0.9344F, 0.0126F, 2, 2, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5042F, -4.9693F, 10.0881F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5105F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 8, -1.0F, -1.0484F, -0.2155F, 1, 1, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5042F, 0.0656F, 4.0126F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.6581F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 17, -0.5F, -2.0F, -0.4F, 0, 5, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.0208F, -5.7811F, 10.2025F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6545F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -0.8F, -7.0F, 0, 4, 16, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5042F, 0.0656F, 4.0126F);
        this.tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6981F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 30, -1.0F, -1.0F, -1.0F, 1, 1, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0042F, 1.5656F, 3.5126F);
        this.tail4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 6, 0.0F, -1.15F, -3.5F, 0, 3, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 22, 20, -3.0F, -9.0F, -19.75F, 5, 6, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 53, 1.1F, -7.5F, -19.25F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 53, -3.1F, -7.5F, -19.25F, 1, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -9.0F, -19.75F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 22, -2.0F, 2.38F, -1.5F, 3, 1, 2, 0.01F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 17, -2.0F, 3.4F, -1.5F, 3, 1, 2, 0.01F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 40, -2.0F, 4.4F, -4.5F, 3, 1, 5, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -3.0F, -19.75F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1484F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 35, -0.5F, -1.0F, -4.0F, 1, 1, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 40, -1.5F, -1.0F, -4.0F, 1, 1, 4, 0.001F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 46, 0.5F, -1.0F, -4.0F, 1, 1, 4, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.0F, -4.1F, -19.75F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.2051F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 41, 32, 0.125F, -0.5F, -4.5F, 1, 1, 5, -0.001F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.0F, -4.1F, -19.75F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.2051F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 32, -1.125F, -0.5F, -4.5F, 1, 1, 5, -0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -6.1005F, -22.5421F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4363F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 46, -1.5F, 0.5F, -2.2F, 3, 1, 3, -0.011F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -9.0F, -19.75F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.9163F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 37, -2.0F, 0.0F, -5.0F, 3, 2, 5, 0.0F, false));

        this.dorsal = new AdvancedModelRenderer(this);
        this.dorsal.setRotationPoint(-0.5F, -9.0F, -15.75F);
        this.head.addChild(dorsal);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.dorsal.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.7505F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 25, 0.0F, -8.175F, -0.1F, 0, 9, 6, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -6.4791F, 4.996F);
        this.dorsal.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.0908F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 8, -0.5F, -2.8753F, -0.5374F, 1, 3, 1, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.dorsal.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.6981F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 46, -0.5F, -8.275F, -0.875F, 1, 9, 1, 0.0F, false));

        this.crest = new AdvancedModelRenderer(this);
        this.crest.setRotationPoint(0.0F, -9.375F, -18.75F);
        this.head.addChild(crest);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.crest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3491F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 0, -1.0F, -0.1F, -1.625F, 1, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -0.3811F, -2.0547F);
        this.crest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.1345F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 30, -0.5F, -0.6446F, -0.0139F, 1, 2, 1, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -2.9923F, -18.9901F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.0077F, -0.0099F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -0.5F, -1.0F, -1.95F, 1, 1, 2, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.08F;
        this.body.render(0.01F);
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
        //this.head.offsetY = 1.45F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        ((EntityPrehistoricFloraIschyodus)e).tailBuffer.applyChainSwingBuffer(fishTail);
        float speed = 0.15F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && (e.isInWater())) {



            //this.walk(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

                this.swing(frontleftfin, (float)(speed), (float)Math.toRadians(-48.3802), false, -3, 0.6F, f2, 1);
                this.swing(frontrightfin, (float)(speed), (float)Math.toRadians(-48.3802), false, -6, -0.6F, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.18F, -3, f2, 1);
                this.swing(backleftfin, (speed), 0.2F, true, 0, 0, f2, 1);
                this.swing(backrightfin, (speed), 0.2F, true, 0, 0, f2, 1);


           // this.walk(backrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

        }
    }
}
