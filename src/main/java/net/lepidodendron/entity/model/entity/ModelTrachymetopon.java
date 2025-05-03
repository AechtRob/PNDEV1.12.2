package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrachymetopon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer PelvicFinR;
    private final AdvancedModelRenderer PelvicFinL;
    private final AdvancedModelRenderer PectoralFinR;
    private final AdvancedModelRenderer PectoralFinL;
    private final AdvancedModelRenderer lip;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer lip1;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer lip2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;

    public ModelTrachymetopon() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 40, 0, -6.5F, -13.75F, -16.0F, 13, 13, 9, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 94, 79, -5.0F, -9.0F, -24.75F, 10, 2, 2, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 36, 48, -5.0F, -8.5F, -24.25F, 10, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -10.0F, -24.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 103, -4.5F, 0.0F, -4.4F, 9, 5, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -10.0F, -24.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6981F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 103, 106, -4.0F, -0.9F, -7.25F, 8, 2, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -17.0F, -14.0F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6981F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 78, 95, -5.0F, -1.0F, -12.9F, 10, 5, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.0F, -16.0F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 82, 36, -5.5F, -5.75F, -7.0F, 11, 6, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -17.0F, -14.0F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5672F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 82, 66, -5.5F, 0.0F, -8.0F, 11, 5, 8, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -17.0F, -14.0F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3229F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 79, 83, -6.0F, 0.0F, 0.0F, 12, 5, 7, -0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, -7.25F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 52, 11, 0.0F, -32.0F, 3.25F, 0, 12, 11, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 50, 48, -6.0F, -19.0F, -0.75F, 12, 18, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -19.0F, -0.75F);
        this.Body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2443F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 84, 0, -5.0F, 0.0F, 0.0F, 10, 2, 8, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -12.0F, 7.25F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 37, -5.5F, -9.0F, -1.0F, 11, 17, 14, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 8.0F, 13.0F);
        this.Body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 68, -5.0F, -3.0F, -14.0F, 10, 3, 14, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 0, -4.5F, -8.25F, -1.0F, 9, 15, 11, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -8.0F, 5.0F);
        this.Body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.8116F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 63, 0.5F, -12.25F, -2.0F, 0, 10, 5, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 90, 50, -0.5F, -6.25F, -2.0F, 2, 8, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 6.75F, 6.0F);
        this.Body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 30, 0.5F, 3.5F, -2.0F, 0, 11, 7, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, 0.0F, 0.0F, 2, 8, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -8.0F, 5.0F);
        this.Body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1134F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 99, -3.5F, -0.25F, -6.0F, 8, 1, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 6.25F, 5.0F);
        this.Body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 98, 10, -3.5F, -1.75F, -6.0F, 8, 2, 7, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -1.0F, 10.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 74, 12, -3.5F, -7.4F, -2.0F, 7, 14, 10, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 46, 90, -3.0F, -2.9F, -2.5F, 6, 3, 10, 0.0F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 1.0F, 8.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 16, 85, -2.5F, -1.15F, -1.0F, 5, 6, 10, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 0, 0.0F, -10.55F, -0.5F, 0, 11, 26, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 29, 2, -0.01F, -0.05F, 21.5F, 0, 3, 5, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 0, -0.01F, 0.45F, 26.5F, 0, 2, 1, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 36, 14, 0.0F, 2.45F, 2.5F, 0, 11, 23, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 68, 91, -1.5F, -0.15F, 9.0F, 3, 3, 4, 0.01F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 90, 50, 0.0F, 0.35F, 13.0F, 1, 2, 12, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 90, 50, -1.0F, 0.35F, 13.0F, 1, 2, 12, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.2F, 19.9F);
        this.Body6.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5847F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 124, -1.0F, -2.0547F, -15.8722F, 3, 3, 1, -0.01F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 115, -1.0F, -4.0547F, -14.8722F, 3, 5, 15, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.0F, 15.0F);
        this.Body6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6283F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 133, -1.0F, -2.8F, -12.95F, 3, 7, 17, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Body6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 171, -2.0F, -0.55F, -1.65F, 4, 10, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 6.0F, -8.0F);
        this.Body6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2618F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 75, 0, -2.0F, -4.0F, 7.0F, 4, 4, 4, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 2.75F, 13.0F);
        this.Body6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 47, 103, -1.5F, 3.15F, -11.4F, 4, 5, 7, 0.0F, false));

        this.PelvicFinR = new AdvancedModelRenderer(this);
        this.PelvicFinR.setRotationPoint(-1.5F, 9.5F, 6.0F);
        this.Body3.addChild(PelvicFinR);
        this.setRotateAngle(PelvicFinR, -0.2618F, -0.3927F, 0.0436F);
        this.PelvicFinR.cubeList.add(new ModelBox(PelvicFinR, 36, 85, -1.0F, -2.0F, 0.0F, 1, 2, 8, 0.0F, false));
        this.PelvicFinR.cubeList.add(new ModelBox(PelvicFinR, 76, 70, -0.5F, -3.0F, 5.0F, 0, 4, 9, 0.0F, false));

        this.PelvicFinL = new AdvancedModelRenderer(this);
        this.PelvicFinL.setRotationPoint(1.5F, 9.5F, 6.0F);
        this.Body3.addChild(PelvicFinL);
        this.setRotateAngle(PelvicFinL, -0.2618F, 0.3927F, -0.0436F);
        this.PelvicFinL.cubeList.add(new ModelBox(PelvicFinL, 36, 85, 0.0F, -2.0F, 0.0F, 1, 2, 8, 0.0F, true));
        this.PelvicFinL.cubeList.add(new ModelBox(PelvicFinL, 76, 70, 0.5F, -3.0F, 5.0F, 0, 4, 9, 0.0F, true));

        this.PectoralFinR = new AdvancedModelRenderer(this);
        this.PectoralFinR.setRotationPoint(-6.0F, -4.25F, -9.0F);
        this.Body.addChild(PectoralFinR);
        this.setRotateAngle(PectoralFinR, -0.2618F, -0.2618F, 0.0F);
        this.PectoralFinR.cubeList.add(new ModelBox(PectoralFinR, 104, 50, -0.5F, -1.5F, 0.0F, 2, 3, 8, 0.0F, false));
        this.PectoralFinR.cubeList.add(new ModelBox(PectoralFinR, 0, 72, 0.5F, -3.5F, 4.0F, 0, 7, 13, 0.0F, false));

        this.PectoralFinL = new AdvancedModelRenderer(this);
        this.PectoralFinL.setRotationPoint(6.0F, -4.25F, -9.0F);
        this.Body.addChild(PectoralFinL);
        this.setRotateAngle(PectoralFinL, -0.2618F, 0.2618F, 0.0F);
        this.PectoralFinL.cubeList.add(new ModelBox(PectoralFinL, 104, 50, -1.5F, -1.5F, 0.0F, 2, 3, 8, 0.0F, true));
        this.PectoralFinL.cubeList.add(new ModelBox(PectoralFinL, 0, 72, -0.5F, -3.5F, 4.0F, 0, 7, 13, 0.0F, true));

        this.lip = new AdvancedModelRenderer(this);
        this.lip.setRotationPoint(0.0F, -5.0F, -28.25F);
        this.Body.addChild(lip);
        this.setRotateAngle(lip, 0.1309F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -5.0F, 4.25F);
        this.lip.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.0472F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 0, -3.5F, -1.9F, -6.5F, 7, 5, 2, 0.0F, false));

        this.lip1 = new AdvancedModelRenderer(this);
        this.lip1.setRotationPoint(-3.5F, -2.0F, 0.5F);
        this.lip.addChild(lip1);
        this.setRotateAngle(lip1, 0.0F, -0.2618F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(3.25F, -3.0F, 3.75F);
        this.lip1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.1345F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 68, -3.95F, -2.775F, -6.475F, 2, 6, 2, 0.0F, false));

        this.lip2 = new AdvancedModelRenderer(this);
        this.lip2.setRotationPoint(3.5F, -2.0F, 0.5F);
        this.lip.addChild(lip2);
        this.setRotateAngle(lip2, 0.0F, 0.2618F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-3.25F, -3.0F, 3.75F);
        this.lip2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.1345F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 68, 1.95F, -2.775F, -6.475F, 2, 6, 2, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, -4.0F, -16.0F);
        this.Body.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.2618F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 48, 74, -4.5F, -3.0F, -9.0F, 9, 6, 10, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.0F, 2.6F, -13.25F);
        this.Jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3054F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 69, 105, -5.0F, 0.0F, 0.0F, 6, 1, 5, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.0F, 3.0F, -8.5F);
        this.Jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 86, 106, -5.0F, -1.0F, -4.75F, 6, 1, 5, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -0.3F;
        this.Body.offsetX = 0.0F;
        this.Body.offsetZ = 2.0F;
        this.Body.rotateAngleY = (float)Math.toRadians(120);
        this.Body.rotateAngleX = (float)Math.toRadians(0);
        this.Body.rotateAngleZ = (float)Math.toRadians(0);
        this.Body.scaleChildren = true;
        float scaler = 0.6F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Jaw, -0.25F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Jaw, -0.25F, 0.0F, 0.0F);
        this.Body.offsetY = 0.05F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(Jaw, 0.1F, 0.0F, 0.0F);
        this.Body.offsetY = -0.3F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Bodyfront.offsetY = 1.3F;

        AdvancedModelRenderer[] fishTail = {this.Body4, this.Body5, this.Body6};

        float speed = 0.166F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.15F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);


            this.walk(Jaw, (float) (speed * 0.5), 0.1F, true, -0.8F, -0.1F, f2, 1);


        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.50F * still, -1.25, f2, 0.5F * still);
            this.swing(Body, speed*still, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Body, speed*still, 0.1F, true, 0, 0, f2, 0.5F);
        }

        this.walk(PectoralFinL, (float) (speed * 0.75*still), 0.1F, true, 3, 0, f2, 1);
        this.swing(PectoralFinL, (float) (speed * 0.75*still), 0.1F, true, 3, 0, f2, 1);
        this.walk(PectoralFinR, (float) (speed * 0.75*still), 0.1F, true, 0, 0, f2, 1);
        this.swing(PectoralFinR, (float) (speed * 0.75*still), -0.1F, true, 0, 0, f2, 1);

        this.walk(PelvicFinL, (float) (speed * 0.75*still), 0.2F, true, 0, 0, f2, 1);
        this.swing(PelvicFinL, (float) (speed * 0.75*still), 0.2F, true, 0, 0, f2, 1);
        this.flap(PelvicFinL, (float) (speed * 0.75*still), 0.2F, true, 0, 0, f2, 1);

        this.walk(PelvicFinR, (float) (speed * 0.75*still), 0.2F, true, 3, 0, f2, 1);
        this.swing(PelvicFinR, (float) (speed * 0.75*still), -0.2F, true, 3, 0, f2, 1);
        this.flap(PelvicFinR, (float) (speed * 0.75*still), 0.2F, true, 3, 0, f2, 1);

        if (!e.isInWater()) {
            this.Body.rotateAngleZ = (float) Math.toRadians(90);
            this.Body.offsetY = -0.3F;
            this.Body.offsetX = -0.8F;
            this.bob(Body, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

}

