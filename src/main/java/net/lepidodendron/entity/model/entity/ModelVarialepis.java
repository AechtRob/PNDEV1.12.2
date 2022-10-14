package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelVarialepis extends AdvancedModelBase {
    private final AdvancedModelRenderer varialepis;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightPectoral;
    private final AdvancedModelRenderer leftPectoral;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer lowerbody;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    public ModelVarialepis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.varialepis = new AdvancedModelRenderer(this);
        this.varialepis.setRotationPoint(-0.5F, 24.0F, 10.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.6077F, -14.7294F);
        this.varialepis.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 17, 0, -1.5F, -0.6423F, -9.6706F, 4, 2, 7, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 41, -2.0F, -0.6423F, -3.2706F, 5, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.75F, -0.6423F, -7.5206F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -1.0F, -0.75F, -0.75F, 1, 1, 1, 0.01F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -4.5F, -0.75F, -0.75F, 1, 1, 1, 0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -1.25F, -1.25F, 1, 2, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.5F, -1.25F, -1.25F, 1, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 3.6077F, -0.2706F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 16, -2.0F, -1.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.5223F, -8.0712F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.3963F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 53, -2.0F, -1.37F, -1.5F, 4, 2, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -4.3923F, -0.2706F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, 0.0F, -9.0F, 4, 4, 9, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.3577F, -3.2706F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 34, -1.0F, -0.03F, -6.0F, 4, 1, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 2.0F, 0.0F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 46, 0.0F, -1.0F, -6.0F, 3, 1, 6, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.5F, -6.1013F, -14.9524F);
        this.varialepis.addChild(upperbody);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 26, -2.5F, -2.8987F, -0.0476F, 5, 8, 8, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 5.8513F, 6.9524F);
        this.upperbody.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 2, -2.0F, -1.0F, -7.0F, 4, 1, 7, 0.0F, false));

        this.rightPectoral = new AdvancedModelRenderer(this);
        this.rightPectoral.setRotationPoint(-2.5F, 3.1284F, 0.3601F);
        this.upperbody.addChild(rightPectoral);
        this.setRotateAngle(rightPectoral, -0.9422F, -0.4239F, 0.5148F);
        this.rightPectoral.cubeList.add(new ModelBox(rightPectoral, 0, 33, 0.0F, -2.0511F, -0.0492F, 0, 4, 9, 0.0F, false));

        this.leftPectoral = new AdvancedModelRenderer(this);
        this.leftPectoral.setRotationPoint(2.5F, 3.1284F, 0.3601F);
        this.upperbody.addChild(leftPectoral);
        this.setRotateAngle(leftPectoral, -1.062F, 0.5657F, -0.7654F);
        this.leftPectoral.cubeList.add(new ModelBox(leftPectoral, 0, 33, 0.0F, -2.0511F, -0.0492F, 0, 4, 9, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.3844F, 6.9491F);
        this.upperbody.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 19, 16, -2.5F, -3.2831F, 0.0033F, 5, 9, 9, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 5.4669F, 5.5033F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1293F, 0.1176F, -0.7341F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 0, 1.0F, -1.205F, -5.4851F, 0, 6, 10, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.4669F, 5.5033F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1293F, -0.1176F, 0.7341F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 0, -1.0F, -1.205F, -5.4851F, 0, 6, 10, 0.0F, false));

        this.lowerbody = new AdvancedModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, 1.2169F, 9.0033F);
        this.body.addChild(lowerbody);
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 20, 40, -2.0F, -4.5F, -1.5F, 4, 8, 6, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.lowerbody.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 29, -1.5F, -1.15F, -0.25F, 3, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.0944F, 4.4092F);
        this.lowerbody.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 50, 49, -1.5F, -1.9056F, -0.4092F, 3, 5, 4, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.4444F, 0.9769F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.0036F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 10, 0.0F, -0.3385F, -1.5489F, 0, 9, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -4.4056F, -0.4092F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5236F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 49, 8, -1.0F, 0.0F, 0.0F, 2, 3, 5, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -4.4208F, -0.4575F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.1781F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 44, 0.0F, -7.0131F, 0.0489F, 0, 8, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1556F, 3.5908F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 47, 20, -1.0F, -1.75F, -1.0F, 2, 4, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.25F, -1.0F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 54, -0.5F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.75F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2628F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.25F, 4.75F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, 0.35F, -6.0F, 0, 11, 14, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.25F, 4.75F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 0, -0.5F, 0.0F, 0.0F, 1, 1, 7, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -1.0F, 0.0F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 48, 0.0F, 0.0F, -1.0F, 1, 2, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.varialepis.render(f5 * 0.15F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.varialepis.rotateAngleY = (float) Math.toRadians(90);
        this.varialepis.offsetX = 0.01F;
        this.varialepis.offsetY = -0.22F;
        this.varialepis.offsetZ = 0F;
        this.varialepis.render(0.01F);
        GlStateManager.enableCull();
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
        this.varialepis.offsetY = 1.1F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.lowerbody, this.tail, this.tail2, this.tail3};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.swing(varialepis, speed, -0.18F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, -0.2F, f2, 1);
            this.walk(leftPectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(leftPectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(rightPectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(rightPectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.varialepis.rotateAngleZ = (float) Math.toRadians(90);
                this.varialepis.offsetY = 1.25F;
                this.bob(varialepis, -speed, 5F, false, f2, 1);
            }
        }
    }
}
