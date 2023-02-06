package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDiplacanthus extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r20;

    public ModelDiplacanthus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.2143F, -2.649F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.6847F, -1.2988F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3622F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 0, -1.0F, -2.0168F, -2.9703F, 2, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.8977F, 2.3028F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 16, -1.0F, -1.7579F, -3.5689F, 2, 2, 3, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.4069F, 0.6737F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4058F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 13, 0.0F, -9.8188F, -1.7355F, 0, 11, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.2619F, 0.4553F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 17, -1.0F, -0.15F, -3.025F, 2, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.5357F, 0.149F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1527F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 3, -1.5F, -3.3F, -3.275F, 3, 6, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.3002F, 1.2081F);
        this.main.addChild(tail);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.6641F, 2.0258F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.9643F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 20, 0.0F, -9.0219F, 0.3857F, 0, 9, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.6641F, 2.0258F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3578F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 27, -1.0F, -0.0219F, -0.9893F, 2, 2, 4, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5645F, 2.9909F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0218F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 9, -1.5F, -1.1F, -3.0F, 3, 3, 5, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.3348F, 1.6777F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 0, 0.0F, -0.177F, 0.4529F, 0, 5, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 0, -1.0F, -3.177F, -1.2221F, 2, 3, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3654F, 4.9145F);
        this.tail.addChild(tail2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.3799F, -0.0985F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 8, 0.0F, -3.725F, -0.175F, 0, 7, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.5357F, 0.149F);
        this.main.addChild(head);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.3319F, -6.9197F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.3614F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 3, -1.0F, -0.0254F, -0.996F, 2, 1, 1, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.8333F, -5.2756F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.9905F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 23, -1.0F, -0.0288F, -2.9893F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1353F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 23, -1.0F, -1.85F, -2.05F, 2, 3, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.4379F, -4.8012F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3098F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 2, -1.075F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 2, 0.075F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -4.0F, -2.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3883F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 11, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.1916F, -3.8297F);
        this.head.addChild(jaw);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.9406F, -0.3134F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1963F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 27, -0.5F, -1.0F, -2.55F, 1, 1, 3, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.225F, 3.8177F, 0.745F);
        this.main.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.8727F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.4F, 0.0F, 0.0F);
        this.backleftfin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2284F, -0.298F, 0.0681F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 8, -1.5F, 0.0F, -0.7F, 5, 0, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.225F, 3.8177F, 0.745F);
        this.main.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.8727F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.4F, 0.0F, 0.0F);
        this.backrightfin.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2284F, 0.298F, -0.0681F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 8, -3.5F, 0.0F, -0.7F, 5, 0, 3, 0.0F, true));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(0.75F, 2.0847F, -2.0488F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 1.0908F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 2.0F, 1.3F);
        this.frontleftfin.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.2182F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.5F, -2.0F, -3.0F, 11, 0, 3, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-0.75F, 2.0847F, -2.0488F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -1.0908F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.5F, 2.0F, 1.3F);
        this.frontrightfin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.2182F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -11.5F, -2.0F, -3.0F, 11, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.render(0.01F);
        //GlStateManager.enableCull();
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            this.swing(main, speed, 0.15F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontleftfin, (float) (speed * 0.75), 0.18F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), 0.18F, true, -3, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.flap(backleftfin, (float) (speed * 0.75), 0.2F, true, 0.5F, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.05F, true, 0.5F, 0, f2, 1);
            this.flap(backrightfin, (float) (speed * 0.75), 0.2F, true, 3.5F, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.05F, true, 3.5F, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);

            }
        }
    }
}
