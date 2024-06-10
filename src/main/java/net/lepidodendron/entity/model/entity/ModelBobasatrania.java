package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBobasatrania extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Bobasatrania;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;

    public ModelBobasatrania() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Bobasatrania = new AdvancedModelRenderer(this);
        this.Bobasatrania.setRotationPoint(0.0F, 13.0F, -3.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Bobasatrania.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 38, 49, -2.0F, -3.0F, -4.0F, 4, 8, 4, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 35, 62, -1.5F, -2.0F, -6.0F, 3, 5, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 30, 32, -1.7F, -0.5F, -5.6F, 1, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 30, 25, 0.7F, -0.5F, -5.6F, 1, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 7, 0, -1.0F, -1.0F, -7.0F, 2, 4, 1, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 5.2F, -4.6F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2094F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 25, -1.5F, -1.3F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.0F, -5.0F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 9, -1.0F, -1.3F, -2.3F, 2, 1, 1, 0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 25, -1.5F, -1.3F, -1.3F, 3, 1, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.0647F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 59, -1.0F, -7.0F, 0.0F, 2, 8, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.6F, -3.6F);
        this.Cephalon.addChild(jaw);
        this.setRotateAngle(jaw, -0.4189F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 10, -1.5F, -0.4521F, -2.1821F, 3, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 14, -1.0F, -0.4521F, -3.1821F, 2, 1, 1, -0.01F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 1.0F, -3.3F);
        this.Bobasatrania.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 43, -2.0F, -5.0F, 0.0F, 4, 9, 6, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2443F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 36, 0.0F, 0.3F, 0.9F, 0, 1, 6, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 25, -1.5F, -2.2F, -0.1F, 3, 3, 7, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Body1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4538F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 61, 0.0F, -2.0F, 0.7F, 0, 1, 6, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 0, -1.5F, -1.5F, -0.3F, 3, 5, 7, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.0F, 2.0F, 1.0F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, -0.2182F, -0.6545F, 0.0F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 12, 18, 0.0F, -1.0F, 0.0F, 0, 7, 17, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.0F, 2.0F, 1.0F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -0.2182F, 0.6545F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 12, 18, 0.0F, -1.0F, 0.0F, 0, 7, 17, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 21, 44, -1.5F, -7.0F, 0.0F, 3, 12, 5, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -10.3F, 1.4F);
        this.Body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.9599F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 31, 0.0F, -0.0685F, -0.1884F, 0, 5, 12, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 67, -1.0F, -0.0685F, -2.1884F, 2, 5, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -9.0F, -0.6F);
        this.Body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4538F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 0, 0.0F, -0.7F, 0.093F, 0, 1, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 62, -1.5F, -0.272F, 0.093F, 3, 5, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 6.7F, 1.5F);
        this.Body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4974F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 49, 0.0F, -0.0054F, -0.0304F, 0, 13, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.7F, 1.5F);
        this.Body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3665F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 60, 44, -1.0F, -3.1054F, -0.0304F, 2, 3, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 4.0F, -6.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2443F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 43, -1.5F, -2.3F, 6.9F, 3, 3, 1, -0.02F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 15, 0, -1.0F, -5.0F, -0.2F, 2, 8, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -7.3F, 0.4F);
        this.Body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.9338F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 64, 52, 0.0F, -0.0658F, -0.0253F, 0, 4, 4, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -7.3F, 0.4F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.9512F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 35, -1.0F, -0.1658F, -3.0253F, 2, 4, 3, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 5.2F, 0.2F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6196F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 65, 9, 0.0F, -0.331F, -0.1222F, 0, 4, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 5.2F, 0.2F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5847F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 59, -1.0F, -2.931F, -0.0222F, 2, 3, 4, -0.01F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 2.7F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 46, 62, -1.0F, -3.0F, -0.1F, 2, 6, 2, -0.01F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 0, -0.5F, -2.0F, 1.9F, 1, 4, 1, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 40, 12, -0.5F, -1.1F, 2.9F, 1, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 4.2F, 0.6F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6021F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.0F, -0.6311F, -0.0382F, 0, 3, 6, -0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 0, -0.5F, -1.9311F, -0.0382F, 1, 2, 6, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -4.3F, 0.4F);
        this.Body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.0036F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 67, 0.0F, 0.3268F, -0.1517F, 0, 5, 3, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -4.3F, 0.4F);
        this.Body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.0734F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 62, 22, -0.5F, 0.1268F, -3.1517F, 1, 6, 3, -0.02F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.1F, 5.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 39, 0, -0.5F, -1.0F, -0.1F, 1, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.1F, 0.3F);
        this.Body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0524F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 0.0F, -10.0F, 0.0F, 0, 20, 14, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.1F, 0.3F);
        this.Body5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.6109F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 0, -0.5F, -0.7F, 0.8F, 1, 1, 12, -0.01F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bobasatrania.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Bobasatrania.rotateAngleY = (float) Math.toRadians(90);
        this.Bobasatrania.offsetX = -0.025F;
        this.Bobasatrania.offsetY = -0.13F;
        this.Bobasatrania.offsetZ = 0.02F;
        this.Bobasatrania.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bobasatrania, -0.1F, 0.1F, 0.1F);
        this.setRotateAngle(Body1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.25F, 0.0F);
        this.Bobasatrania.offsetY = -0.2F;
        this.Bobasatrania.render(0.01F);
        this.resetToDefaultPose();
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
        //this.Bobasatrania.offsetY = 0.55F - 0.55F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3,this.Body4,this.Body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.15F, -1.5, f2, 1);
            this.swing(Bobasatrania, speed, 0.3F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.65), -0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, -0.2F, f2, 1);
            if (!e.isInWater()) {
                this.Bobasatrania.rotateAngleZ = (float) Math.toRadians(90);
                this.Bobasatrania.offsetY = 0.40F;
                this.bob(Bobasatrania, -speed, 5F, false, f2, 1);
            }
        }
    }
}
