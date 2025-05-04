package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVestinautilus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended whole;
    private final AdvancedModelRendererExtended topmiddleright;
    private final AdvancedModelRendererExtended topmiddleleft;
    private final AdvancedModelRendererExtended lowerleft;
    private final AdvancedModelRendererExtended bottommiddleleft;
    private final AdvancedModelRendererExtended bottommiddleright;
    private final AdvancedModelRendererExtended bottomright;
    private final AdvancedModelRendererExtended bottom;
    private final AdvancedModelRendererExtended toprightarm;
    private final AdvancedModelRendererExtended topleft;
    private final AdvancedModelRendererExtended top;
    private final AdvancedModelRendererExtended hood;
    private final AdvancedModelRendererExtended hood_r1;
    private final AdvancedModelRendererExtended hood_r2;
    private final AdvancedModelRendererExtended shell;
    private final AdvancedModelRendererExtended shell_r1;
    private final AdvancedModelRendererExtended shell_r2;
    private final AdvancedModelRendererExtended shell_r3;
    private final AdvancedModelRendererExtended shell_r4;
    private final AdvancedModelRendererExtended shell_r5;
    private final AdvancedModelRendererExtended shell_r6;
    private final AdvancedModelRendererExtended shell_r7;
    private final AdvancedModelRendererExtended shell_r8;
    private final AdvancedModelRendererExtended shell_r9;
    private final AdvancedModelRendererExtended shell_r10;
    private final AdvancedModelRendererExtended shell_r11;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lefteye_r1;
    private final AdvancedModelRendererExtended head_r1;
    private final AdvancedModelRendererExtended siphon;
    private final AdvancedModelRendererExtended siphon_r1;
    private final AdvancedModelRendererExtended tentacle9;
    private final AdvancedModelRendererExtended tentacles9;
    private final AdvancedModelRendererExtended tentacle10;
    private final AdvancedModelRendererExtended tentacles10;
    private final AdvancedModelRendererExtended tentacle8;
    private final AdvancedModelRendererExtended tentacles8;
    private final AdvancedModelRendererExtended tentacle11;
    private final AdvancedModelRendererExtended tentacles11;
    private final AdvancedModelRendererExtended tentacle7;
    private final AdvancedModelRendererExtended tentacles7;
    private final AdvancedModelRendererExtended tentacle12;
    private final AdvancedModelRendererExtended tentacles12;
    private final AdvancedModelRendererExtended tentacle6;
    private final AdvancedModelRendererExtended tentacles6;
    private final AdvancedModelRendererExtended tentacle13;
    private final AdvancedModelRendererExtended tentacles13;
    private final AdvancedModelRendererExtended tentacle5;
    private final AdvancedModelRendererExtended tentacles5;
    private final AdvancedModelRendererExtended tentacle14;
    private final AdvancedModelRendererExtended tentacles14;
    private final AdvancedModelRendererExtended tentacle4;
    private final AdvancedModelRendererExtended tentacles4;
    private final AdvancedModelRendererExtended tentacle15;
    private final AdvancedModelRendererExtended tentacles15;
    private final AdvancedModelRendererExtended tentacle3;
    private final AdvancedModelRendererExtended tentacles3;
    private final AdvancedModelRendererExtended tentacle16;
    private final AdvancedModelRendererExtended tentacles16;
    private final AdvancedModelRendererExtended tentacle2;
    private final AdvancedModelRendererExtended tentacles2;
    private final AdvancedModelRendererExtended tentacle17;
    private final AdvancedModelRendererExtended tentacles17;
    private final AdvancedModelRendererExtended tentacle;
    private final AdvancedModelRendererExtended tentacles;

    public ModelVestinautilus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.whole = new AdvancedModelRendererExtended(this);
        this.whole.setRotationPoint(-4.0F, 15.0F, -2.0F);
        this.setRotateAngle(whole, -1.6144F, 0.0F, 0.0F);


        this.topmiddleright = new AdvancedModelRendererExtended(this);
        this.topmiddleright.setRotationPoint(7.0F, 4.25F, -0.5F);
        this.whole.addChild(topmiddleright);


        this.topmiddleleft = new AdvancedModelRendererExtended(this);
        this.topmiddleleft.setRotationPoint(1.0F, 4.5F, -0.5F);
        this.whole.addChild(topmiddleleft);
        this.setRotateAngle(topmiddleleft, 0.0873F, 0.0F, 0.0F);


        this.lowerleft = new AdvancedModelRendererExtended(this);
        this.lowerleft.setRotationPoint(2.1F, 3.75F, 3.6F);
        this.whole.addChild(lowerleft);


        this.bottommiddleleft = new AdvancedModelRendererExtended(this);
        this.bottommiddleleft.setRotationPoint(1.0F, 3.75F, 1.5F);
        this.whole.addChild(bottommiddleleft);
        this.setRotateAngle(bottommiddleleft, -0.0436F, 0.0F, 0.0F);


        this.bottommiddleright = new AdvancedModelRendererExtended(this);
        this.bottommiddleright.setRotationPoint(7.0F, 3.75F, 1.25F);
        this.whole.addChild(bottommiddleright);


        this.bottomright = new AdvancedModelRendererExtended(this);
        this.bottomright.setRotationPoint(6.0F, 3.75F, 3.5F);
        this.whole.addChild(bottomright);


        this.bottom = new AdvancedModelRendererExtended(this);
        this.bottom.setRotationPoint(4.0F, 3.75F, 3.5F);
        this.whole.addChild(bottom);


        this.toprightarm = new AdvancedModelRendererExtended(this);
        this.toprightarm.setRotationPoint(6.0F, 4.75F, -2.5F);
        this.whole.addChild(toprightarm);


        this.topleft = new AdvancedModelRendererExtended(this);
        this.topleft.setRotationPoint(2.0F, 4.75F, -2.5F);
        this.whole.addChild(topleft);


        this.top = new AdvancedModelRendererExtended(this);
        this.top.setRotationPoint(4.0F, 4.75F, -2.5F);
        this.whole.addChild(top);


        this.hood = new AdvancedModelRendererExtended(this);
        this.hood.setRotationPoint(8.0F, 1.0F, -7.0F);
        this.whole.addChild(hood);


        this.hood_r1 = new AdvancedModelRendererExtended(this);
        this.hood_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hood.addChild(hood_r1);
        this.setRotateAngle(hood_r1, -0.0436F, 0.0F, 0.0F);
        this.hood_r1.cubeList.add(new ModelBox(hood_r1, 68, 56, -8.0F, -8.25F, -0.25F, 8, 8, 3, 0.0F, false));

        this.hood_r2 = new AdvancedModelRendererExtended(this);
        this.hood_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hood.addChild(hood_r2);
        this.setRotateAngle(hood_r2, -0.0873F, 0.0F, 0.0F);
        this.hood_r2.cubeList.add(new ModelBox(hood_r2, 0, 70, -9.0F, -8.75F, 1.25F, 10, 10, 2, 0.0F, false));

        this.shell = new AdvancedModelRendererExtended(this);
        this.shell.setRotationPoint(7.5F, 0.0F, 2.0F);
        this.whole.addChild(shell);


        this.shell_r1 = new AdvancedModelRendererExtended(this);
        this.shell_r1.setRotationPoint(0.0F, -8.0F, -14.0F);
        this.shell.addChild(shell_r1);
        this.setRotateAngle(shell_r1, 0.8727F, -0.0436F, 0.0F);
        this.shell_r1.cubeList.add(new ModelBox(shell_r1, 0, 21, -3.6393F, -5.7495F, 6.6307F, 1, 8, 2, 0.0F, false));

        this.shell_r2 = new AdvancedModelRendererExtended(this);
        this.shell_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(shell_r2);
        this.setRotateAngle(shell_r2, -0.0873F, -0.0436F, 0.0F);
        this.shell_r2.cubeList.add(new ModelBox(shell_r2, 0, 0, -4.5F, -12.5F, -10.25F, 2, 8, 2, 0.0F, false));

        this.shell_r3 = new AdvancedModelRendererExtended(this);
        this.shell_r3.setRotationPoint(-3.75F, -7.0F, -17.0F);
        this.shell.addChild(shell_r3);
        this.setRotateAngle(shell_r3, 0.6109F, 0.0F, 0.0F);
        this.shell_r3.cubeList.add(new ModelBox(shell_r3, 36, 0, -1.75F, 3.2349F, 0.1785F, 4, 4, 8, 0.0F, false));

        this.shell_r4 = new AdvancedModelRendererExtended(this);
        this.shell_r4.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r4);
        this.setRotateAngle(shell_r4, 0.6109F, 0.0F, 0.0F);
        this.shell_r4.cubeList.add(new ModelBox(shell_r4, 60, 31, -2.25F, 3.5322F, -17.2149F, 6, 6, 6, 0.0F, false));

        this.shell_r5 = new AdvancedModelRendererExtended(this);
        this.shell_r5.setRotationPoint(-3.75F, -7.0F, -17.0F);
        this.shell.addChild(shell_r5);
        this.setRotateAngle(shell_r5, -0.0873F, 0.0F, 0.0F);
        this.shell_r5.cubeList.add(new ModelBox(shell_r5, 60, 0, -2.25F, 0.4849F, -1.8215F, 5, 5, 7, 0.0F, false));

        this.shell_r6 = new AdvancedModelRendererExtended(this);
        this.shell_r6.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r6);
        this.setRotateAngle(shell_r6, 0.1309F, 0.0F, 0.0F);
        this.shell_r6.cubeList.add(new ModelBox(shell_r6, 62, 67, -2.75F, 0.2822F, -14.2149F, 7, 12, 6, 0.0F, false));

        this.shell_r7 = new AdvancedModelRendererExtended(this);
        this.shell_r7.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r7);
        this.setRotateAngle(shell_r7, -0.829F, 0.0F, 0.0F);
        this.shell_r7.cubeList.add(new ModelBox(shell_r7, 0, 48, -3.25F, -1.9678F, -8.2149F, 8, 14, 8, 0.0F, false));

        this.shell_r8 = new AdvancedModelRendererExtended(this);
        this.shell_r8.setRotationPoint(-4.25F, -15.0F, -2.0F);
        this.shell.addChild(shell_r8);
        this.setRotateAngle(shell_r8, 0.5672F, 0.0F, 0.0F);
        this.shell_r8.cubeList.add(new ModelBox(shell_r8, 0, 21, -4.25F, -10.427F, -6.6562F, 10, 13, 11, 0.0F, false));

        this.shell_r9 = new AdvancedModelRendererExtended(this);
        this.shell_r9.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r9);
        this.setRotateAngle(shell_r9, -0.0436F, 0.0F, 0.0F);
        this.shell_r9.cubeList.add(new ModelBox(shell_r9, 30, 33, -3.75F, -7.2178F, -5.4649F, 9, 11, 12, 0.0F, false));

        this.shell_r10 = new AdvancedModelRendererExtended(this);
        this.shell_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(shell_r10);
        this.setRotateAngle(shell_r10, 0.0436F, 0.0F, 0.0F);
        this.shell_r10.cubeList.add(new ModelBox(shell_r10, 0, 0, -9.5F, -15.75F, -8.25F, 12, 9, 12, 0.0F, false));

        this.shell_r11 = new AdvancedModelRendererExtended(this);
        this.shell_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(shell_r11);
        this.setRotateAngle(shell_r11, 0.1745F, 0.0F, 0.0F);
        this.shell_r11.cubeList.add(new ModelBox(shell_r11, 42, 15, -10.0F, -10.25F, -0.25F, 13, 10, 6, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.whole.addChild(head);


        this.lefteye_r1 = new AdvancedModelRendererExtended(this);
        this.lefteye_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lefteye_r1);
        this.setRotateAngle(lefteye_r1, 0.0873F, 0.0F, 0.0F);
        this.lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 31, 21, -1.0F, -6.0F, -2.0F, 1, 3, 3, 0.0F, false));
        this.lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 36, 0, 8.0F, -6.0F, -2.0F, 1, 3, 3, 0.0F, false));

        this.head_r1 = new AdvancedModelRendererExtended(this);
        this.head_r1.setRotationPoint(7.5F, 0.0F, 2.0F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.0436F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 32, 56, -8.0F, -7.0F, -6.0F, 9, 8, 9, 0.0F, false));

        this.siphon = new AdvancedModelRendererExtended(this);
        this.siphon.setRotationPoint(4.0F, -2.0F, 5.0F);
        this.head.addChild(siphon);


        this.siphon_r1 = new AdvancedModelRendererExtended(this);
        this.siphon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.siphon.addChild(siphon_r1);
        this.setRotateAngle(siphon_r1, 0.1309F, 0.0F, 0.0F);
        this.siphon_r1.cubeList.add(new ModelBox(siphon_r1, 24, 73, -1.5F, -5.0198F, -2.3624F, 3, 12, 3, 0.0F, false));

        this.tentacle9 = new AdvancedModelRendererExtended(this);
        this.tentacle9.setRotationPoint(4.0F, 1.0F, -2.5F);
        this.head.addChild(tentacle9);
        this.setRotateAngle(tentacle9, -0.3491F, 0.0F, 0.0F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles9 = new AdvancedModelRendererExtended(this);
        this.tentacles9.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle9.addChild(tentacles9);
        this.tentacles9.cubeList.add(new ModelBox(tentacles9, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle10 = new AdvancedModelRendererExtended(this);
        this.tentacle10.setRotationPoint(3.0F, 1.0F, -2.0F);
        this.head.addChild(tentacle10);
        this.setRotateAngle(tentacle10, -0.2618F, 0.0F, 0.1309F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles10 = new AdvancedModelRendererExtended(this);
        this.tentacles10.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle10.addChild(tentacles10);
        this.tentacles10.cubeList.add(new ModelBox(tentacles10, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle8 = new AdvancedModelRendererExtended(this);
        this.tentacle8.setRotationPoint(5.0F, 1.0F, -2.0F);
        this.head.addChild(tentacle8);
        this.setRotateAngle(tentacle8, -0.2618F, 0.0F, -0.1309F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles8 = new AdvancedModelRendererExtended(this);
        this.tentacles8.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle8.addChild(tentacles8);
        this.tentacles8.cubeList.add(new ModelBox(tentacles8, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle11 = new AdvancedModelRendererExtended(this);
        this.tentacle11.setRotationPoint(3.0F, 1.0F, 1.5F);
        this.head.addChild(tentacle11);
        this.setRotateAngle(tentacle11, 0.1745F, 0.0F, 0.1745F);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles11 = new AdvancedModelRendererExtended(this);
        this.tentacles11.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle11.addChild(tentacles11);
        this.tentacles11.cubeList.add(new ModelBox(tentacles11, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle7 = new AdvancedModelRendererExtended(this);
        this.tentacle7.setRotationPoint(5.0F, 1.0F, 1.5F);
        this.head.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.1745F, 0.0F, -0.1745F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles7 = new AdvancedModelRendererExtended(this);
        this.tentacles7.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle7.addChild(tentacles7);
        this.tentacles7.cubeList.add(new ModelBox(tentacles7, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle12 = new AdvancedModelRendererExtended(this);
        this.tentacle12.setRotationPoint(3.0F, 1.0F, -0.5F);
        this.head.addChild(tentacle12);
        this.setRotateAngle(tentacle12, -0.1745F, 0.0F, 0.1745F);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles12 = new AdvancedModelRendererExtended(this);
        this.tentacles12.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle12.addChild(tentacles12);
        this.tentacles12.cubeList.add(new ModelBox(tentacles12, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle6 = new AdvancedModelRendererExtended(this);
        this.tentacle6.setRotationPoint(5.0F, 1.0F, -0.5F);
        this.head.addChild(tentacle6);
        this.setRotateAngle(tentacle6, -0.1745F, 0.0F, -0.1309F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles6 = new AdvancedModelRendererExtended(this);
        this.tentacles6.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle6.addChild(tentacles6);
        this.tentacles6.cubeList.add(new ModelBox(tentacles6, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle13 = new AdvancedModelRendererExtended(this);
        this.tentacle13.setRotationPoint(1.75F, 1.0F, 3.5F);
        this.head.addChild(tentacle13);
        this.setRotateAngle(tentacle13, 0.2618F, 0.0F, 0.1309F);
        this.tentacle13.cubeList.add(new ModelBox(tentacle13, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles13 = new AdvancedModelRendererExtended(this);
        this.tentacles13.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle13.addChild(tentacles13);
        this.tentacles13.cubeList.add(new ModelBox(tentacles13, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle5 = new AdvancedModelRendererExtended(this);
        this.tentacle5.setRotationPoint(6.25F, 1.0F, 3.5F);
        this.head.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.2618F, 0.0F, -0.1309F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles5 = new AdvancedModelRendererExtended(this);
        this.tentacles5.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle5.addChild(tentacles5);
        this.tentacles5.cubeList.add(new ModelBox(tentacles5, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle14 = new AdvancedModelRendererExtended(this);
        this.tentacle14.setRotationPoint(1.0F, 1.0F, 1.5F);
        this.head.addChild(tentacle14);
        this.setRotateAngle(tentacle14, 0.1745F, 0.0F, 0.2182F);
        this.tentacle14.cubeList.add(new ModelBox(tentacle14, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles14 = new AdvancedModelRendererExtended(this);
        this.tentacles14.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle14.addChild(tentacles14);
        this.tentacles14.cubeList.add(new ModelBox(tentacles14, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle4 = new AdvancedModelRendererExtended(this);
        this.tentacle4.setRotationPoint(7.0F, 1.0F, 1.5F);
        this.head.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.1745F, 0.0F, -0.2182F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles4 = new AdvancedModelRendererExtended(this);
        this.tentacles4.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle4.addChild(tentacles4);
        this.tentacles4.cubeList.add(new ModelBox(tentacles4, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle15 = new AdvancedModelRendererExtended(this);
        this.tentacle15.setRotationPoint(1.0F, 1.0F, 0.5F);
        this.head.addChild(tentacle15);
        this.setRotateAngle(tentacle15, 0.0F, 0.0F, 0.2618F);
        this.tentacle15.cubeList.add(new ModelBox(tentacle15, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles15 = new AdvancedModelRendererExtended(this);
        this.tentacles15.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle15.addChild(tentacles15);
        this.tentacles15.cubeList.add(new ModelBox(tentacles15, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle3 = new AdvancedModelRendererExtended(this);
        this.tentacle3.setRotationPoint(7.0F, 1.0F, 0.5F);
        this.head.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, 0.0F, -0.2618F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles3 = new AdvancedModelRendererExtended(this);
        this.tentacles3.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle3.addChild(tentacles3);
        this.tentacles3.cubeList.add(new ModelBox(tentacles3, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle16 = new AdvancedModelRendererExtended(this);
        this.tentacle16.setRotationPoint(1.0F, 1.0F, -0.5F);
        this.head.addChild(tentacle16);
        this.setRotateAngle(tentacle16, -0.1745F, 0.0F, 0.2182F);
        this.tentacle16.cubeList.add(new ModelBox(tentacle16, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles16 = new AdvancedModelRendererExtended(this);
        this.tentacles16.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle16.addChild(tentacles16);
        this.tentacles16.cubeList.add(new ModelBox(tentacles16, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle2 = new AdvancedModelRendererExtended(this);
        this.tentacle2.setRotationPoint(7.0F, 1.0F, -0.5F);
        this.head.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.1745F, 0.0F, -0.2182F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles2 = new AdvancedModelRendererExtended(this);
        this.tentacles2.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle2.addChild(tentacles2);
        this.tentacles2.cubeList.add(new ModelBox(tentacles2, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle17 = new AdvancedModelRendererExtended(this);
        this.tentacle17.setRotationPoint(2.0F, 1.0F, -2.5F);
        this.head.addChild(tentacle17);
        this.setRotateAngle(tentacle17, -0.2618F, 0.0F, 0.2182F);
        this.tentacle17.cubeList.add(new ModelBox(tentacle17, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles17 = new AdvancedModelRendererExtended(this);
        this.tentacles17.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle17.addChild(tentacles17);
        this.tentacles17.cubeList.add(new ModelBox(tentacles17, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle = new AdvancedModelRendererExtended(this);
        this.tentacle.setRotationPoint(6.0F, 1.0F, -2.5F);
        this.head.addChild(tentacle);
        this.setRotateAngle(tentacle, -0.2618F, 0.0F, -0.2182F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles = new AdvancedModelRendererExtended(this);
        this.tentacles.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle.addChild(tentacles);
        this.tentacles.cubeList.add(new ModelBox(tentacles, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.whole.render(f5 * 0.076F);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.whole.offsetY = 0.15F;
        this.whole.offsetX = 0.25F;
        this.whole.offsetZ = 2.0F;
        this.whole.rotateAngleY = (float)Math.toRadians(120);
        this.whole.rotateAngleX = (float)Math.toRadians(0);
        this.whole.rotateAngleZ = (float)Math.toRadians(0);
        this.whole.scaleChildren = true;
        float scaler = 0.4F;
        this.whole.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(whole, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.whole.render(f);
        //Reset rotations, positions and sizing:
        this.whole.setScale(1.0F, 1.0F, 1.0F);
        this.whole.scaleChildren = false;
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
        this.whole.offsetY = 1.35F;
        this.whole.rotateAngleY = (float)Math.toRadians(180D);

        AdvancedModelRendererExtended[] tentacle1 = {this.tentacle, this.tentacles};
        AdvancedModelRendererExtended[] tentacle2 = {this.tentacle2, this.tentacles2};
        AdvancedModelRendererExtended[] tentacle3 = {this.tentacle3, this.tentacles3};
        AdvancedModelRendererExtended[] tentacle4 = {this.tentacle4, this.tentacles4};
        AdvancedModelRendererExtended[] tentacle5 = {this.tentacle5, this.tentacles5};
        AdvancedModelRendererExtended[] tentacle6 = {this.tentacle6, this.tentacles6};
        AdvancedModelRendererExtended[] tentacle7 = {this.tentacle7, this.tentacles7};
        AdvancedModelRendererExtended[] tentacle8 = {this.tentacle8, this.tentacles8};
        AdvancedModelRendererExtended[] tentacle9 = {this.tentacle9, this.tentacles9};
        AdvancedModelRendererExtended[] tentacle10 = {this.tentacle10, this.tentacles10};
        AdvancedModelRendererExtended[] tentacle11 = {this.tentacle11, this.tentacles11};
        AdvancedModelRendererExtended[] tentacle12 = {this.tentacle12, this.tentacles12};
        AdvancedModelRendererExtended[] tentacle13 = {this.tentacle13, this.tentacles13};
        AdvancedModelRendererExtended[] tentacle14 = {this.tentacle14, this.tentacles14};
        AdvancedModelRendererExtended[] tentacle15 = {this.tentacle15, this.tentacles15};
        AdvancedModelRendererExtended[] tentacle16 = {this.tentacle16, this.tentacles16};
        AdvancedModelRendererExtended[] tentacle17 = {this.tentacle17, this.tentacles17};

        float speed = 0.19F;
        float greaterFloat = 0.44F;
        float lesserFloat = 0.26F;

        //top set:
        this.chainWave(tentacle1, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle1, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle8, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle9, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle10, speed, greaterFloat, 1.5F, f2, 0.8F);

        this.chainWave(tentacle17, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle17, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //bottom set:
        this.chainWave(tentacle5, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle5, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle13, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle13, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //left set:
        this.chainFlap(tentacle2, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle2, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle3, speed, greaterFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle4, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle4, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //right set:
        this.chainFlap(tentacle16, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainWave(tentacle16, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle15, speed, -greaterFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle14, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainWave(tentacle14, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //centre four:
        this.chainWave(tentacle6, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle6, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle12, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle12, speed, -lesserFloat, 1.5F, f2, 0.8F);

        this.chainWave(tentacle7, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle7, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle11, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle11, speed, -lesserFloat, 1.5F, f2, 0.8F);


        if (e.isInWater()) {
            this.bob(whole, 0.22F, 0.90F, false, f2, 2);
            this.walk(whole, 0.2F, 0.15F, false, 0,0.15F,1.5F,1.0F);
            this.whole.offsetZ = this.moveBoxExtended(speed, 0.125F, false, 0.5F, f2, 1);
        }
        else {
            this.whole.rotateAngleZ = (float) Math.toRadians(90);
            this.whole.offsetY = 1.45F;
        }
    }
}
