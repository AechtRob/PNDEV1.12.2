package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelNerepisacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    public ModelNerepisacanthus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.7458F, 0.2104F);
        this.main.cubeList.add(new ModelBox(main, 8, 9, -1.5F, -1.5958F, -3.7104F, 3, 4, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.5958F, -0.7104F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4494F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, 0.0F, -3.8F, -0.025F, 0, 4, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.1328F, -3.6894F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.5F, -0.7223F, -0.0082F, 3, 1, 6, -0.001F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.5F, 2.1542F, -2.2104F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -0.9599F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontleftfin.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -0.225F, -1.175F, 0, 3, 3, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.5F, 2.1542F, -2.2104F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 0.9599F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontrightfin.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -0.225F, -1.175F, 0, 3, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 5.1542F, -0.2104F);
        this.main.addChild(head);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.725F, -4.925F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.048F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 26, -1.5F, -0.525F, -1.525F, 3, 1, 3, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -6.75F, -3.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.6F, 0.275F, -4.675F, 1, 1, 1, 0.01F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.6F, 0.275F, -4.675F, 1, 1, 1, 0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 2, -1.5F, 0.025F, -4.925F, 3, 2, 5, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.186F, -3.8794F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 19, -1.0F, -0.1218F, -3.8958F, 2, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.3782F, 0.1042F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 21, -1.0F, -1.2F, -3.125F, 2, 1, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.825F, -0.2718F, -3.3708F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.24F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 6, 0.0F, -0.525F, 1.975F, 0, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 6, 1.65F, -0.525F, 1.975F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 6, 0.0F, -0.325F, 0.875F, 0, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 6, 1.65F, -0.325F, 0.875F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 6, 0.0F, -0.125F, -0.325F, 0, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 6, 1.65F, -0.125F, -0.325F, 0, 1, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.3491F, 1.9523F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 19, -1.5F, -2.9449F, 0.0122F, 3, 4, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.9551F, 1.5122F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0742F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 9, -1.5F, -0.475F, -1.525F, 3, 1, 4, -0.02F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(0.0F, 3.8051F, -2.4878F);
        this.body.addChild(backleftfin);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, -2.75F, 4.5F);
        this.backleftfin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.9163F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 17, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(0.0F, 3.8051F, -2.4878F);
        this.body.addChild(backrightfin);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, -2.75F, 4.5F);
        this.backrightfin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.9163F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.8992F, 3.8829F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 23, 15, -1.0F, -1.2957F, 0.0293F, 2, 2, 4, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.6456F, 3.1342F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4363F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 17, 0.0F, -0.375F, -0.775F, 0, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.0457F, 0.0293F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1178F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 25, -1.0F, 0.075F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.9351F, 3.1832F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0866F, -0.2334F, 1.2116F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 0, -0.05F, -0.0808F, -1.2462F, 0, 3, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 0.9351F, 3.1832F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0866F, 0.2334F, -1.2116F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 0, 0.05F, -0.0808F, -1.2462F, 0, 3, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.7043F, 0.0293F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2487F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 0, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2957F, 3.7543F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 27, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, 0.0F, -5.0F, 0.0F, 0, 8, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.22F;
        this.main.offsetX = -0.05F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(tail2, 0.4752F, -0.3931F, -0.1946F);
        this.main.offsetY = -0.45F;
        this.main.offsetZ = 0.0F;
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.1F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(tail2, 0.4752F, -0.3931F, -0.1946F);
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
        this.resetToDefaultPose();
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            this.swing(main, speed, 0.15F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.25F, true, 0, -0.2F, f2, 1);
            this.flap(frontleftfin, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.walk(frontleftfin, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), 0.25F, true, -3, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.05F, true, -3, 0, f2, 1);
            this.flap(backleftfin, (float) (speed * 0.75), 0.2F, true, 0.5F, 0, f2, 1);
            this.walk(backleftfin, (float) (speed * 0.75), 0.05F, true, 0.5F, 0, f2, 1);
            this.flap(backrightfin, (float) (speed * 0.75), 0.2F, true, 3.5F, 0, f2, 1);
            this.walk(backrightfin, (float) (speed * 0.75), 0.05F, true, 3.5F, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.1F;
            }
        }
    }
}
